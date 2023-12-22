package br.edu.infnet.apppetshop.model.repositories;

import br.edu.infnet.apppetshop.model.domain.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {
}

