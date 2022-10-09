package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.repositories.UsuarioRepository;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public void incluir(Usuario usuario) {
        usuarioRepository.save(usuario);

        AppImpressao.relatorio("Usuário " + usuario.getNome() + " cadastrado com sucesso", usuario);
    }

    public void excluir(Integer id) {

        usuarioRepository.deleteById(id);
    }

    public Collection<Usuario> obterLista() {
        return (Collection<Usuario>) usuarioRepository.findAll();
    }

    public Usuario validar(String email, String senha) {
        Usuario usuario = usuarioRepository.findUsuarioByEmail(email);

        if (usuario != null && senha.equals(usuario.getSenha())) {
            return usuario;
        }
        return null;

    }

    public Optional<Usuario> findById(Integer id) {
    return  usuarioRepository.findById(id);
    }
}
