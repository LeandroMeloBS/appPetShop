package br.edu.infnet.apppetshop.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apppetshop.model.domain.ProprietarioDoAnimal;
@Repository
public interface ProprietarioDoAnimalRepository extends CrudRepository<ProprietarioDoAnimal, Integer> {

}
