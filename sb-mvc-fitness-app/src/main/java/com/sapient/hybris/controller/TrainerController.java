package com.sapient.hybris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.hybris.model.Trainer;
import com.sapient.hybris.service.TrainerException;
import com.sapient.hybris.service.TrainerService;

@Controller
@RequestMapping("/tc")
public class TrainerController {
	@Autowired
	private TrainerService trainerService;
	
	
	@GetMapping("/menu")
	public String getMenu() {
		return "trainer-menu";
	}
	
	@GetMapping("/listall")
	public ModelAndView listAll() {
		try {
			List<Trainer> TrainerList= trainerService.getTrainer();
			return new ModelAndView("list-all-trainers","TrainerList",TrainerList);
		}catch(TrainerException e) {
			return new ModelAndView("status","message",e.getMessage());
		}
	}
	
	
	@RequestMapping("/delete")
	public ModelAndView deleteTrainer(@RequestParam(value = "id") Integer id) {
		try {
			String message= trainerService.deleteTrainer(id);
			return new ModelAndView("status","message",message);
		}catch(TrainerException e) {
			return new ModelAndView("status","message",e.getMessage());
		}
	}
	
	
	@RequestMapping("/addtrainer")
	public ModelAndView preRegisterTrainer() {
		return new ModelAndView("add-trainer","trainer",new Trainer());
	}
	
	@PostMapping("/register")
	public ModelAndView postRegisterTrainer(@ModelAttribute Trainer trainer) {
		try {
			
			String message= trainerService.addTrainer(trainer);
			return new ModelAndView("status","message",message);
		}catch(TrainerException e) {
			return new ModelAndView("status","message",e.getMessage());
		}
	}
	
	
	@RequestMapping("/preedit")
	public ModelAndView preEditTrainer(@RequestParam(value = "id") Integer id) {
		try {
			
			Trainer trainer= trainerService.getTrainerById(id);			
			return new ModelAndView("edit-trainer","trainer",trainer);
		}catch(TrainerException e) {
			return new ModelAndView("status","message",e.getMessage());
		}
	}
	
	
	@RequestMapping("/postedit")
	public ModelAndView postEditTrainer(@ModelAttribute Trainer trainer) {
		try {
			
			String message= trainerService.updateTrainer(trainer);
			return new ModelAndView("status","message",message);
		}catch(TrainerException e) {
			return new ModelAndView("status","message",e.getMessage());
		}
	}
	
	
}
