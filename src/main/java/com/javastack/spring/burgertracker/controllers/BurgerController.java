package com.javastack.spring.burgertracker.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.javastack.spring.burgertracker.models.Burger;
import com.javastack.spring.burgertracker.services.BurgerService;

@Controller
public class BurgerController {
	
	private final BurgerService burgerService;
	
	public BurgerController(BurgerService burgerService) {
		this.burgerService = burgerService;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		ArrayList<Burger> burgers = new ArrayList<Burger>();
		burgers = (ArrayList<Burger>) burgerService.allBurgers();
		model.addAttribute("burgers", burgers);
		return "index.jsp";
	}
	@PostMapping("/")
	public String createBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
		if(result.hasErrors()) {
			return "create.jsp";
		}
		else {
			burgerService.createBurger(burger);
			return "redirect:/";	
		}
	}
	
	@GetMapping("/create")
	public String createPage(@ModelAttribute("burger") Burger burger) {
		return "create.jsp";
	}

}
