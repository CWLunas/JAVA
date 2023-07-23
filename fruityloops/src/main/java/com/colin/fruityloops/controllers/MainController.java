package com.colin.fruityloops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.colin.fruityloops.models.Fruit;

@Controller
public class MainController {
	@RequestMapping("/")
	public String FruitStore(Model model) {
		
        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Fruit("Apple", 1.5));
        fruits.add(new Fruit("Watermellon", 5.0));
        fruits.add(new Fruit("Blue Berries", 2.0));
        fruits.add(new Fruit("Mandarine Orange", 7.00));
		
        model.addAttribute("allfruits", fruits);
        
		return "Main.jsp";
	}

}
