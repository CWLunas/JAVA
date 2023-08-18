package com.colin.LoginAndRegistration.controllers;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.colin.LoginAndRegistration.models.LoginUser;
import com.colin.LoginAndRegistration.models.User;
import com.colin.LoginAndRegistration.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {
	
	@Autowired
	private UserService uService;

	
	@GetMapping("/")
	public String register(@ModelAttribute("newUser") User user) {
		return "index.jsp";
	}
	
	@PostMapping("/registration")
	public String process(@Valid @ModelAttribute("newUser") User user, BindingResult result) {
		
		Boolean isValid = uService.isValid(result,  user);
		
		if (result.hasErrors() || isValid != true) {
			System.out.println(result);
			return "index.jsp";
		}
		
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		
		user.setPassword(hashed);
		user.setConfirm(hashed);
		
		uService.create(user);
		
		return "redirect:/";
	}
	
	@GetMapping("/login")
	public String loginPage(@ModelAttribute("loginUser") LoginUser user) {
		return "login.jsp";
	}
	
	@PostMapping("/login")
	public String process (@Valid @ModelAttribute("loginUser") LoginUser user, BindingResult result, HttpSession session) {
		
		Boolean isValid = uService.attemptLogin(result, user, session);
		
		if (result.hasErrors() || isValid != true) {
			return "login.jsp";			
		}
		
		
		return "redirect:/welcome";
	}
	
	@GetMapping("/welcome")
	public String welcome(HttpSession session, Model model, RedirectAttributes flashAttributes) {
		
		if ( session.getAttribute("loggedIn") == null) {
			flashAttributes.addFlashAttribute("loginError", "You must be logged into a valid account");
			return "redirect:/login";
		}
		
		User loggedIn = uService.find((Long)session.getAttribute("loggedIn"));
		
		model.addAttribute("loggedInUser", loggedIn);
		return "welcome.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
}
