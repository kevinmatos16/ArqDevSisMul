package br.usjt.springclima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.springclima.model.Clima;
import br.usjt.springclima.repository.ClimaRepository;

@Service
public class ClimaService {
	@Autowired

	private ClimaRepository climaRepo;
	
	
	public List <Clima> listarTodos (){
		List <Clima> climas = climaRepo.findAll();
		return climas;
	}
}
