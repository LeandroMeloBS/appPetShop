package br.edu.infnet.apppetshop.model.service;

import br.edu.infnet.apppetshop.model.domain.ProprietarioDoAnimal;
import br.edu.infnet.apppetshop.model.repositories.ProprietarioDoAnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProprietarioDoAnimalService {

    @Autowired
    private ProprietarioDoAnimalRepository proprietarioRepository;

    public void incluir(ProprietarioDoAnimal proprietario) {
        proprietarioRepository.save(proprietario);
    }

    public Collection<ProprietarioDoAnimal> obterLista() {
        return (Collection<ProprietarioDoAnimal>) proprietarioRepository.findAll();
    }
    
    public void excluir (Integer id) {
    	proprietarioRepository.deleteById(id);
	}
}
