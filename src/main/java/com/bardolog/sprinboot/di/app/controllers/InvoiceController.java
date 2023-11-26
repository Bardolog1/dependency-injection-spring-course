package com.bardolog.sprinboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bardolog.sprinboot.di.app.models.domain.Invoice;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

	@Autowired
	private Invoice invoice;
	
	@GetMapping("/view")
	public String ver(Model model) {
		model.addAttribute("invoice",invoice);
		model.addAttribute("title", "Example invoice with dependency injection");
		return "invoice/view"	 ;
	}
	
}
