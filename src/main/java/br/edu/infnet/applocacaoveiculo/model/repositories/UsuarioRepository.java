package br.edu.infnet.applocacaoveiculo.model.repositories;

import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
