package br.edu.infnet.applocacaoveiculo.model.repositories;

import br.edu.infnet.applocacaoveiculo.model.domain.Cliente;
import br.edu.infnet.applocacaoveiculo.model.domain.Locacao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface LocacaoRepository extends CrudRepository<Locacao, Integer> {

    @Query("from Locacao l where l.usuario.id = :userId")
    Collection<Locacao> findAll(Integer userId);
}
