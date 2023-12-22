package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.model.domain.Funcionario;
import br.edu.infnet.apppetshop.model.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
    public void incluir(Funcionario funcionario) {
    	funcionarioRepository.save(funcionario);
    }

    public Collection<Funcionario> obterLista() {
        return (Collection<Funcionario>) funcionarioRepository.findAll();
    }
    
    public void excluir (Integer id) {
		funcionarioRepository.deleteById(id);
	}
}

