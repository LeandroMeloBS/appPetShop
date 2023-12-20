package br.edu.infnet.apppetshop.model.service;

import br.edu.infnet.apppetshop.model.domain.Animal;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AnimalService {

    private Map<String, Animal> mapa = new HashMap<>();

    public void incluir(Animal animal) {
        mapa.put(animal.getNome(), animal);
    }

    public Collection<Animal> obterLista() {
        return mapa.values();
    }
}
