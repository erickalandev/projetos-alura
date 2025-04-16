package br.com.alura.codechella.application.gateways;

import java.util.List;

import br.com.alura.codechella.domain.entities.Usuario;

public interface RepositorioUsuario {
    
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
