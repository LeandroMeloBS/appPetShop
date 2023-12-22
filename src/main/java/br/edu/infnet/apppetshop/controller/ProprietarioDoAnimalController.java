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

import br.edu.infnet.apppetshop.model.domain.ProprietarioDoAnimal;
import br.edu.infnet.apppetshop.model.service.ProprietarioDoAnimalService;

@RestController
@RequestMapping("/api/proprietario")
public class ProprietarioDoAnimalController {

    @Autowired
    private ProprietarioDoAnimalService proprietarioService;

    @GetMapping(value = "listar")
    public List<ProprietarioDoAnimal> obterLista() {
        return (List<ProprietarioDoAnimal>) proprietarioService.obterLista();
    }

    @PostMapping(value = "incluir")
    public void incluir(@RequestBody ProprietarioDoAnimal proprietario) {
        proprietarioService.incluir(proprietario);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id) {
        proprietarioService.excluir(id);
    }
}
