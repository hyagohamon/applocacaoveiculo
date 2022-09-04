package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.controller.UsuarioController;
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class UsuarioTest implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {

        Usuario usuario = new Usuario("admin", "admin", "admin@admin.com");
        UsuarioController.incluir(usuario);
    }
}
