package br.edu.infnet.apppetshop.model.service;

import br.edu.infnet.apppetshop.model.domain.AgendamentoServicos;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AgendamentoServicosService {

    private Map<String, AgendamentoServicos> mapa = new HashMap<>();

    public void incluir(AgendamentoServicos agendamentoServicos) {
        mapa.put(agendamentoServicos.getDataAgendamento().toString(), agendamentoServicos);
    }

    public Collection<AgendamentoServicos> obterLista() {
        return mapa.values();
    }
}
