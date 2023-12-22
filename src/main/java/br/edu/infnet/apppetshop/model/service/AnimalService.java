package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.model.domain.Animal;
import br.edu.infnet.apppetshop.model.repositories.AnimalRepository;

@Service
public class AnimalService {

    @Autowired
	private AnimalRepository animalRepository; 
	
	
    public void incluir(Animal animal) {
    	animalRepository.save(animal);
    }

    public Collection<Animal> obterLista() {
        return (Collection<Animal>) animalRepository.findAll();
    }
    
    public void excluir (Integer id) {
    	animalRepository.deleteById(id);
	}
}

