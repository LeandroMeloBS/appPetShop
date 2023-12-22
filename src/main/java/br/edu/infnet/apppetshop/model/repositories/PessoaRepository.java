package br.edu.infnet.apppetshop.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apppetshop.model.domain.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

}
