package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.model.domain.AgendamentoServicos;
import br.edu.infnet.apppetshop.model.repositories.AgendamentoServicosRepository;

@Service
public class AgendamentoServicosService {

    
	@Autowired
	private AgendamentoServicosRepository agendamentoServicosRepository;

    public void incluir(AgendamentoServicos agendamentoServicos) {
    	agendamentoServicosRepository.save(agendamentoServicos);
    }

    public Collection<AgendamentoServicos> obterLista() {
        return (Collection<AgendamentoServicos>)agendamentoServicosRepository.findAll();
    }
    
    public void excluir (Integer id) {
    	agendamentoServicosRepository.deleteById(id);
	}
}
