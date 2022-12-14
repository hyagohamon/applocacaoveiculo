package br.edu.infnet.applocacaoveiculo.model.repositories;

import br.edu.infnet.applocacaoveiculo.model.domain.Moto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface MotoRepository extends CrudRepository<Moto, Integer> {

    @Query("From Moto m where m.usuario.id = :idUsuario")
    Collection<Moto> findAll(Integer idUsuario);
}
