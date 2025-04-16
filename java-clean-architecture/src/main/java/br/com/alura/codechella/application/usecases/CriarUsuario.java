package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.domain.entities.Usuario;

public class CadastrarUsuario {
    
    private final RepositorioUsuario repository;

    public CadastrarUsuario(RepositorioUsuario repositorioUsuario) {
        this.repository = repositorioUsuario;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repository.cadastrarUsuario(usuario);
    }
}
