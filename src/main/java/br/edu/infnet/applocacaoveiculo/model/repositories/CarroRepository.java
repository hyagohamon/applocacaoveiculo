package br.edu.infnet.applocacaoveiculo.model.repositories;

import br.edu.infnet.applocacaoveiculo.model.domain.Carro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Integer> {

    @Query("From Carro c where c.usuario.id = :idUsuario")
    Collection<Carro> findAll(Integer idUsuario);
}
