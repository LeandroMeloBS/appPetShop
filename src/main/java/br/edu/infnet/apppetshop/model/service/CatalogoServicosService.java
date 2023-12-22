package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.model.domain.CatalogoServicos;
import br.edu.infnet.apppetshop.model.repositories.CatalogoServicosRepository;

@Service
public class CatalogoServicosService {

    
	@Autowired
	private CatalogoServicosRepository catalogoServicosRepository;
	

    public void incluir(CatalogoServicos catalogoServicos) {
    	catalogoServicosRepository.save(catalogoServicos);
    }

    public Collection<CatalogoServicos> obterLista() {
        return (Collection<CatalogoServicos>)catalogoServicosRepository.findAll();
    }
    
    public void excluir (Integer id) {
    	catalogoServicosRepository.deleteById(id);
	}
}
