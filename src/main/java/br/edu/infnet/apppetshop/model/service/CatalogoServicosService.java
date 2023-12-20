package br.edu.infnet.apppetshop.model.service;

import br.edu.infnet.apppetshop.model.domain.CatalogoServicos;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CatalogoServicosService {

    private Map<String, CatalogoServicos> mapa = new HashMap<>();

    public void incluir(CatalogoServicos catalogoServicos) {
        mapa.put(catalogoServicos.getNomeServico(), catalogoServicos);
    }

    public Collection<CatalogoServicos> obterLista() {
        return mapa.values();
    }
}
