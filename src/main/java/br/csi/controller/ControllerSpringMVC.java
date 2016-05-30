package br.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControllerSpringMVC {
	
	@RequestMapping("spring.html")
	public String teste() {
		System.out.println("--> Chamou o controlador do servidor");
		return "teste";
	}

}
