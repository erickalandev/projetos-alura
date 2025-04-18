package br.com.alura.codechella.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.application.usecases.CriarUsuario;
import br.com.alura.codechella.application.usecases.ListarUsuarios;
import br.com.alura.codechella.infra.gateways.UsuarioMapper;
import br.com.alura.codechella.infra.gateways.UsuarioRepositoryJpa;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;

@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuario criarUsuario(RepositorioUsuario repository) {
        return new CriarUsuario(repository);
    }

    @Bean
    UsuarioRepositoryJpa usuarioRepositoryJpa(UsuarioRepository usuario, UsuarioMapper mapper) {
        return new UsuarioRepositoryJpa(usuario, mapper);
    }

    @Bean
    UsuarioMapper UsuarioMapper() {
        return new UsuarioMapper();
    }

    @Bean
    ListarUsuarios listarUsuarios(RepositorioUsuario repository) {
        return new ListarUsuarios(repository);
    }
}
