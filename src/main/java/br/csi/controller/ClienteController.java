package br.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.ClienteDao;
import br.csi.modelo.Cliente;

@Controller
public class ClienteController {

	@RequestMapping("cliente.html")
	public String msgTeste() {
		System.out.println("Chamou o controlador");
		return "cliente";
	}
	
	@RequestMapping("adicionar-clientes.html")
	public String adiciona(Cliente cliente) {
		
		boolean retorno = new ClienteDao().adicionar(cliente);
		
		if(retorno) {
			return "forward:listar-clientes.html";
		} else {			
			return "erro";
		}
	}
	
	@RequestMapping("listar-clientes.html")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("cliente");
		mv.addObject("clientes", new ClienteDao().listaClientes());
		
		return mv;
	}
}
