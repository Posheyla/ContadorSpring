package com.codingdojo.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControladorEntrada {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String paginaInicio(HttpSession session) {
		
	    	// Si el conteo aún no está en sesión
			if (session.getAttribute("contador") == null) {
			// Usa setAttribute para inicializar el conteo en la sesión
				session.setAttribute("contador", 1);
			}
			else {
			// incrementa el conteo en 1 usando getAttribute y setAttribute
				Integer currentCount = (Integer) session.getAttribute("contador");
				currentCount += 1;
				session.setAttribute("contador", currentCount);
			}
			return "index.jsp";
	}
	
	@RequestMapping(value="/contador", method = RequestMethod.GET)
	public String paginaContador(HttpSession session, Model model) {
		model.addAttribute("countToShow", session.getAttribute("contador"));
		return "contador.jsp";
	    
	}
}
