package br.edu.infnet.apppetshop.model.service;

import br.edu.infnet.apppetshop.model.domain.Funcionario;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class FuncionarioService {

    private Map<String, Funcionario> mapa = new HashMap<>();

    public void incluir(Funcionario funcionario) {
        mapa.put(funcionario.getCpf(), funcionario);
    }

    public Collection<Funcionario> obterLista() {
        return mapa.values();
    }
}

