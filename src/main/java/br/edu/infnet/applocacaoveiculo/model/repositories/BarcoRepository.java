package br.edu.infnet.applocacaoveiculo.model.repositories;

import br.edu.infnet.applocacaoveiculo.model.domain.Barco;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BarcoRepository extends CrudRepository<Barco, Integer> {

    @Query("From Barco b where b.usuario.id = :idUsuario")
    Collection<Barco> findAll(Integer idUsuario);
}
