package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.domain.entities.Usuario;
import br.com.alura.codechella.infra.controller.UsuarioDTO;
import br.com.alura.codechella.infra.persistence.UsuarioEntity;

public class UsuarioMapper {
    
    public UsuarioEntity toEntity(Usuario usuario) {
        return new UsuarioEntity(usuario.getCpf(), usuario.getNome(), usuario.getNascimento(), usuario.getEmail());
    }
    
    public Usuario toUsuario(UsuarioEntity usuario) {
        return new Usuario(usuario.getCpf(), usuario.getNome(), usuario.getNascimento(), usuario.getEmail());
    }

    public Usuario toUsuario(UsuarioDTO dto) {
        return new Usuario(dto.cpf(), dto.nome(), dto.nascimento(), dto.email());
    }

    public UsuarioDTO toUsuarioDTO(Usuario usuario) {
        return new UsuarioDTO(usuario.getCpf(), usuario.getNome(), usuario.getNascimento(), usuario.getEmail());
    }
}
