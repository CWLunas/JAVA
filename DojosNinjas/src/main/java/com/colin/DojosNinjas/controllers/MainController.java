package com.colin.DojosNinjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.colin.DojosNinjas.models.Dojo;
import com.colin.DojosNinjas.models.Ninja;
import com.colin.DojosNinjas.services.DojoService;
import com.colin.DojosNinjas.services.NinjaService;


@Controller
public class MainController {
	private final NinjaService ninjas;
    private final DojoService dojos;

    @Autowired
    public MainController(NinjaService ninjas, DojoService dojos) {
        this.ninjas = ninjas;
        this.dojos = dojos;
    }
	
	// All Rendering GET Routes
	
	@GetMapping("/dojos/new")
	public String newDojoForm(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojoForm.jsp";
	}
	
	@GetMapping("/ninjas/new")
	public String newNinjaForm(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojos.all());
		return "newNinjaForm.jsp";
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		System.out.printf("dojo id from url: %s",id);
		Dojo dojo = dojos.find(id);
		model.addAttribute("dojo", dojo);
		
		return "showDojo.jsp";
	}
	
	@GetMapping("/dojos")
    public String showAllDojos(Model model) {
        java.util.List<Dojo> allDojos = dojos.all(); // Retrieve all Dojos
        model.addAttribute("dojos", allDojos);
        
        return "showDojo.jsp"; // Redirect to a new JSP for displaying all Dojos
    }
	// All processing POST / Redirect routes
	
	@PostMapping("/dojos")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		
		Dojo newDojo = dojos.create(dojo);
		System.out.printf("new id: %s", dojo.getId());
		
		return String.format("redirect:/dojos/%s",newDojo.getId());
	}
	
	@PostMapping("/ninjas")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja) {
		ninja = ninjas.create(ninja);
		return "redirect:/dojos/" + ninja.getDojo().getId();
	}
	
}