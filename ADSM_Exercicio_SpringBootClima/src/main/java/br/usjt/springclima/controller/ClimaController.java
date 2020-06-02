package br.usjt.springclima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import br.usjt.springclima.model.Clima;
import br.usjt.springclima.service.ClimaService;

@Controller
public class ClimaController {
	@Autowired
	private ClimaService climaService;
	
	@GetMapping("/climas")
	public ModelAndView listarClimas() {
		// passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView("lista_clima");
		// para modelar o formulário
		mv.addObject(new Clima());
		// Busque a coleção com o service
		List<Clima> clima = climaService.listarTodos();
		// adicione a coleção ao objeto ModelAndView
		mv.addObject("clima", clima);
		// devolva o ModelAndView
		return mv;
	}

	
}
