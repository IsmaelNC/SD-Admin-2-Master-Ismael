package br.com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.model.Usuario;

@Controller
@RequestMapping("/Login.html")
public class LoginController {
	
	@PostMapping
	public ModelAndView salvar(@Valid Usuario usuario, BindingResult result, Model model, RedirectAttributes attributes) {
		
		String userName = usuario.getUserName();
		String password = usuario.getPassword();
		if(userName.equals("Ismael") && password.equals("12345")) {
			
			ModelAndView MAV1 = new ModelAndView("redirect:/Next.html");
			
			return MAV1;
		}else {
			
			ModelAndView MAV2 = new ModelAndView("redirect:/Login.html");
			
		return MAV2;
		}
	}
}
