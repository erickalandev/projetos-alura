package br.com.alura.codechella.application.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.codechella.infra.usuario.Usuario;
import br.com.alura.codechella.infra.usuario.UsuarioRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public DadosUsuario cadastrarUsuario(DadosCadastroUsuario dadosUsuario) {
        Usuario usuario = new Usuario(dadosUsuario);
        repository.save(usuario);
        return converteDados(usuario);
    }

    public List<DadosUsuario> listarTodos() {
        return repository.findAll().stream()
                .map(u -> converteDados(u))
                .collect(Collectors.toList());
    }

    private DadosUsuario converteDados(Usuario usuario) {
        return new DadosUsuario(usuario.getId(), usuario.getCpf(),
                usuario.getNome(), usuario.getNascimento(), usuario.getEmail());
    }
}
