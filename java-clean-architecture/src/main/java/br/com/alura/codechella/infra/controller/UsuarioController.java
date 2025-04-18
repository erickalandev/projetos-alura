package br.com.alura.codechella.infra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.codechella.application.usecases.CriarUsuario;
import br.com.alura.codechella.application.usecases.ListarUsuarios;
import br.com.alura.codechella.domain.entities.Usuario;
import br.com.alura.codechella.infra.gateways.UsuarioMapper;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    private final CriarUsuario criarUsuario;
    private final UsuarioMapper mapper;
    private final ListarUsuarios listarUsuarios;

    public UsuarioController(CriarUsuario criarUsuario, UsuarioMapper mapper, ListarUsuarios listarUsuarios) {
        this.criarUsuario = criarUsuario;
        this.mapper = mapper;
        this.listarUsuarios = listarUsuarios;
    }

    @PostMapping
    public UsuarioDTO criarUsuario(@RequestBody UsuarioDTO dto) {
        Usuario usuario = this.criarUsuario.cadastrarUsuario(this.mapper.toUsuario(dto));
        return this.mapper.toUsuarioDTO(usuario);
    }

    @GetMapping()
    public List<UsuarioDTO> listarTodos() {
        return this.listarUsuarios.listarUsuario().stream()
                                                  .map(mapper :: toUsuarioDTO)
                                                  .collect(Collectors.toList());
        
    }
    
        
}
