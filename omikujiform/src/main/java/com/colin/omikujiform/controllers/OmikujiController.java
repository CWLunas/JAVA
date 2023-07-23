package com.colin.omikujiform.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"selectedNumber", "city", "person", "endeavor", "creature", "niceMessage"})
public class OmikujiController {

    @GetMapping("/omikuji")
    public String showOmikujiForm(Model model) {
        // Initialize the selectedNumber to 1 when showing the form initially
        model.addAttribute("selectedNumber", 1);
        return "index.jsp"; // This will render the index.jsp file
    }

    @PostMapping("/omikuji")
    public String processOmikujiForm(
            @RequestParam int selectedNumber,
            @RequestParam String city,
            @RequestParam String person,
            @RequestParam String endeavor,
            @RequestParam String creature,
            @RequestParam String niceMessage,
            Model model
    ) {
        // Save the form input in session
        model.addAttribute("selectedNumber", selectedNumber);
        model.addAttribute("city", city);
        model.addAttribute("person", person);
        model.addAttribute("endeavor", endeavor);
        model.addAttribute("creature", creature);
        model.addAttribute("niceMessage", niceMessage);

        return "redirect:/omikuji/show";
    }

    @GetMapping("/omikuji/show")
    public String showFortune(Model model) {
        // Retrieve the form input from session and dynamically render the template
        return "show.jsp";
    }
}