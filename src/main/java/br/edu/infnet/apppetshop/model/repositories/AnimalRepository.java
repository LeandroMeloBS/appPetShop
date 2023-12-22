package br.edu.infnet.apppetshop.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apppetshop.model.domain.Animal;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Integer> {
}

