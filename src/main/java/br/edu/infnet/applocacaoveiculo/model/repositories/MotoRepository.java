package br.edu.infnet.applocacaoveiculo.model.repositories;

import br.edu.infnet.applocacaoveiculo.model.domain.Moto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoRepository extends CrudRepository<Moto, Integer> {


}
