package br.edu.infnet.apppetshop.model.service;

import br.edu.infnet.apppetshop.model.domain.ProprietarioDoAnimal;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProprietarioDoAnimalService {

    private Map<String, ProprietarioDoAnimal> mapa = new HashMap<>();

    public void incluir(ProprietarioDoAnimal proprietario) {
        mapa.put(proprietario.getCpf(), proprietario);
    }

    public Collection<ProprietarioDoAnimal> obterLista() {
        return mapa.values();
    }
}
