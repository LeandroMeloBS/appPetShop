package br.edu.infnet.apppetshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.edu.infnet.apppetshop.model.domain.CatalogoServicos;
import br.edu.infnet.apppetshop.model.service.CatalogoServicosService;

@RestController
@RequestMapping("/api/catalogo-servicos")
public class CatalogoServicosController {

    @Autowired
    private CatalogoServicosService catalogoServicosService;

    @GetMapping(value = "listar")
    public List<CatalogoServicos> obterLista() {
        return (List<CatalogoServicos>) catalogoServicosService.obterLista();
    }

    @PostMapping(value = "incluir")
    public void incluir(@RequestBody CatalogoServicos catalogoServicos) {
        catalogoServicosService.incluir(catalogoServicos);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id) {
        catalogoServicosService.excluir(id);
    }
}

