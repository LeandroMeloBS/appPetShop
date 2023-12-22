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

import br.edu.infnet.apppetshop.model.domain.Animal;
import br.edu.infnet.apppetshop.model.service.AnimalService;

@RestController
@RequestMapping("/api/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping(value = "listar")
    public List<Animal> obterLista() {
        return (List<Animal>) animalService.obterLista();
    }

    @PostMapping(value = "incluir")
    public void incluir(@RequestBody Animal animal) {
        animalService.incluir(animal);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id) {
        animalService.excluir(id);
    }
}

