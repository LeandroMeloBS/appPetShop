package br.edu.infnet.apppetshop.model.domain.teste;

import br.edu.infnet.apppetshop.model.domain.Pessoa;

public class PessoaTeste {

	public static void main (String[] args) {
		
		Pessoa  a = new Pessoa(null, null);
		a.setNome("ricardo");
		a.setCpf("1234567890");
		System.out.println("[Pessoa: "+a.getNome()+"] Inclusão realizada com sucesso!");
	}

}
