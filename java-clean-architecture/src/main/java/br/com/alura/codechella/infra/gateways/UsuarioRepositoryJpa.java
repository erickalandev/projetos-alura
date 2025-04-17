package br.com.alura.codechella.infra.gateways;

import java.util.List;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.domain.entities.Usuario;
import br.com.alura.codechella.infra.persistence.UsuarioEntity;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;

public class UsuarioRepositoryJpa implements RepositorioUsuario {

    private final UsuarioRepository repository;
    private final UsuarioMapper mapper;

    public UsuarioRepositoryJpa(UsuarioRepository repository, UsuarioMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        UsuarioEntity entity = this.repository.save(mapper.toEntity(usuario));
        return mapper.toUsuario(entity);
    }

    @Override
    public List<Usuario> listarTodos() {
        return null;//this.repository.findAll();
    }
    
}
