package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.model.domain.Pessoa;

@Service

public class PessoaService {
	private Map<String, Pessoa> mapa = new HashMap<String, Pessoa>();
	
	public void incluir(Pessoa pessoa) {
		 mapa.put(pessoa.getCpf(),pessoa);
	}
	
	public Collection<Pessoa>  obterLista() {
		return mapa.values();
	}
}
