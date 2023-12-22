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

import br.edu.infnet.apppetshop.model.domain.Funcionario;
import br.edu.infnet.apppetshop.model.service.FuncionarioService;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping(value = "listar")
    public List<Funcionario> obterLista() {
        return (List<Funcionario>) funcionarioService.obterLista();
    }

    @PostMapping(value = "incluir")
    public void incluir(@RequestBody Funcionario funcionario) {
        funcionarioService.incluir(funcionario);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id) {
        funcionarioService.excluir(id);
    }
}

