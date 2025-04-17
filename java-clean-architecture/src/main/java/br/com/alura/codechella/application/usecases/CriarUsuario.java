package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.domain.entities.Usuario;

public class CriarUsuario {
    
    private final RepositorioUsuario repository;

    public CriarUsuario(RepositorioUsuario repositorioUsuario) {
        this.repository = repositorioUsuario;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repository.cadastrarUsuario(usuario);
    }
}
