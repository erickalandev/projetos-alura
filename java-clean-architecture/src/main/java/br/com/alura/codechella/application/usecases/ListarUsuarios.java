package br.com.alura.codechella.application.usecases;

import java.util.List;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.domain.entities.Usuario;

//Use Case Interactor
public class ListarUsuarios {
    
    private final RepositorioUsuario repository;

    public ListarUsuarios(RepositorioUsuario repository) {
        this.repository = repository;
    }

    public List<Usuario> listarUsuario() {
        return this.repository.listarTodos();
    }
}
