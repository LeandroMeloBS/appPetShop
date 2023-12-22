package br.edu.infnet.apppetshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apppetshop.model.domain.Pessoa;
import br.edu.infnet.apppetshop.model.service.PessoaService;



@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

	@Autowired
	
	private PessoaService pessoaService;
	
	@GetMapping(value = "listar")
	public List<Pessoa> obterLista(){
		return (List<Pessoa>)pessoaService.obterLista();
	}
	
	@PostMapping(value = "incluir")
	public void incluir (@RequestBody Pessoa pessoa) {
		pessoaService.incluir(pessoa);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	
	public void excluir (@PathVariable Integer id) {
		pessoaService.excluir(id);
	}
}
