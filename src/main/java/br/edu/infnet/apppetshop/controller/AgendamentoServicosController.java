package br.edu.infnet.apppetshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apppetshop.model.domain.AgendamentoServicos;
import br.edu.infnet.apppetshop.model.service.AgendamentoServicosService;

@RestController
@RequestMapping("/api/agendamento-servicos")
public class AgendamentoServicosController {

    @Autowired
    private AgendamentoServicosService agendamentoServicosService;

    @GetMapping(value = "listar")
    public List<AgendamentoServicos> obterLista() {
        return (List<AgendamentoServicos>) agendamentoServicosService.obterLista();
    }

    @PostMapping(value = "incluir")
    public void incluir(@RequestBody AgendamentoServicos agendamentoServicos) {
        agendamentoServicosService.incluir(agendamentoServicos);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id) {
        agendamentoServicosService.excluir(id);
    }
}

