package br.edu.infnet.applocacaoveiculo.model.repositories;

import br.edu.infnet.applocacaoveiculo.model.domain.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

    @Query("from Cliente c where c.usuario.id = :userId")
    List<Cliente> obterLista(Integer userId);
}
