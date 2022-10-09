package br.edu.infnet.applocacaoveiculo.model.repositories;

import br.edu.infnet.applocacaoveiculo.model.domain.Veiculo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface VeiculoRepository extends CrudRepository<Veiculo, Integer> {

    @Query("From Veiculo v where v.usuario.id = :idUsuario")
    Collection<Veiculo> findAll(Integer idUsuario);
}
