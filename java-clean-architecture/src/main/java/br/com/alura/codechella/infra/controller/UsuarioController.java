package br.com.alura.codechella.infra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.codechella.application.usecases.CriarUsuario;
import br.com.alura.codechella.domain.entities.Usuario;
import br.com.alura.codechella.infra.gateways.UsuarioMapper;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    private final CriarUsuario criarUsuario;
    private final UsuarioMapper mapper;

    public UsuarioController(CriarUsuario criarUsuario, UsuarioMapper mapper) {
        this.criarUsuario = criarUsuario;
        this.mapper = mapper;
    }

    @PostMapping
    public UsuarioDTO criarUsuario(@RequestBody UsuarioDTO dto) {
        Usuario usuario = this.criarUsuario.cadastrarUsuario(this.mapper.toUsuario(dto));
        return this.mapper.toUsuarioDTO(usuario);
    }
        
}
