package com.FinalExam.fleetms.helpdesk.controllers;

import com.FinalExam.fleetms.helpdesk.services.TicketStatusService;
import com.FinalExam.fleetms.helpdesk.models.TicketStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class TicketStatusController {

	@Autowired private TicketStatusService ticketStatusService;
	
	//Get All TicketStatuss
	@GetMapping("/helpdesk/ticketStatuses")
	public String findAll(Model model){		
		model.addAttribute("ticketStatuses", ticketStatusService.findAll());
		return "/helpdesk/ticketStatuses";
	}	
	
	@RequestMapping("/helpdesk/ticketStatus/{id}")
	@ResponseBody
	public Optional<TicketStatus> findById(@PathVariable Integer id)
	{
		return ticketStatusService.findById(id);
	}
	
	//Add TicketStatus
	@PostMapping(value="/helpdesk/ticketStatuses")
	public String addNew(TicketStatus ticketStatus) {
		ticketStatusService.save(ticketStatus);
		return "redirect:/helpdesk/ticketStatuses";
	}
	
	@RequestMapping(value="helpdesk/ticketStatus/delete/{id}", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(@PathVariable Integer id) {
		ticketStatusService.delete(id);
		return "redirect:/helpdesk/ticketStatuses";
	}
}
