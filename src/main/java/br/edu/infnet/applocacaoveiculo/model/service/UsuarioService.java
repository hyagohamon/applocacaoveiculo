package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UsuarioService {

    private static final Map<String, Usuario> usuarioMap = new HashMap<String, Usuario>();

    public void incluir(Usuario usuario) {
        usuarioMap.put(usuario.getEmail(), usuario);

        AppImpressao.relatorio("Usuário " + usuario.getNome() + " cadastrado com sucesso", usuario);
    }

    public void excluir(String email) {
        usuarioMap.remove(email);
    }

    public Collection<Usuario> obterLista() {
        return usuarioMap.values();
    }

    public Usuario validar(String email, String senha) {
        Usuario usuario = usuarioMap.get(email);
        if (usuario != null && senha.equals(usuario.getSenha())) {
            return usuario;
        }
        return null;

    }
}
