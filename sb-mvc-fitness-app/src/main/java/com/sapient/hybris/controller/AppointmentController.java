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

import com.sapient.hybris.model.Appointment;
import com.sapient.hybris.service.AppointmentException;
import com.sapient.hybris.service.AppointmentService;

@Controller
@RequestMapping("/ac")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	
	@GetMapping("/menu")
	public String getMenu() {
		return "home";
	}
	
	@GetMapping("/listall")
	public ModelAndView listAll() {
		try {
			List<Appointment> AppointmentList= appointmentService.getAppointment();
			return new ModelAndView("viewappnt","appointmentList",AppointmentList);
		}catch(AppointmentException e) {
			return new ModelAndView("status","message",e.getMessage());
		}
	}
	
	
	@RequestMapping("/delete")
	public ModelAndView deleteAppointment(@RequestParam(value = "id") Integer id) {
		try {
			String message= appointmentService.deleteAppointment(id);
			return new ModelAndView("status","message",message);
		}catch(AppointmentException e) {
			return new ModelAndView("status","message",e.getMessage());
		}
	}
	
	
	@RequestMapping("/addappnt")
	public ModelAndView preRegisterAppointment() {
		return new ModelAndView("add-appnt","appointment",new Appointment());
	}
	
	@PostMapping("/register")
	public ModelAndView postRegisterAppointment(@ModelAttribute Appointment appointment) {
		try {
			
			String message= appointmentService.addAppointment(appointment);
			return new ModelAndView("status","message",message);
		}catch(AppointmentException e) {
			return new ModelAndView("status","message",e.getMessage());
		}
	}
	
	
	@RequestMapping("/preedit")
	public ModelAndView preEditAppointment(@RequestParam(value = "id") Integer id) {
		try {
			
			Appointment appointment= appointmentService.getAppointmentById(id);			
			return new ModelAndView("edit-appnt","appointment",appointment);
		}catch(AppointmentException e) {
			return new ModelAndView("status","message",e.getMessage());
		}
	}
	
	
	@RequestMapping("/postedit")
	public ModelAndView postEditAppointment(@ModelAttribute Appointment appointment) {
		try {
			
			String message= appointmentService.updateAppointment(appointment);
			return new ModelAndView("status","message",message);
		}catch(AppointmentException e) {
			return new ModelAndView("status","message",e.getMessage());
		}
	}
	
	
}
