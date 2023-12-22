package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.model.domain.Pessoa;
import br.edu.infnet.apppetshop.model.repositories.PessoaRepository;

@Service

public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;  
	
		
	public void incluir(Pessoa pessoa) {
			pessoaRepository.save(pessoa);
		 
	}
	
	public Collection<Pessoa>  obterLista() {
		return (Collection<Pessoa>) pessoaRepository.findAll();
	
	}
	
	public void excluir (Integer id) {
		pessoaRepository.deleteById(id);
	}
}
