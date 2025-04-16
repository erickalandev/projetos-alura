package br.com.alura.codechella.domain.entities;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void naoDeveAceitarCpfInvalidoOuNuloOuVazio() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Usuario("123456.789-00","Jacque", LocalDate.parse("1990-01-01"), "email@email.com");
        });
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Usuario(null,"Jacque", LocalDate.parse("1990-01-01"), "email@email.com");
        });
    }

    @Test
    public void deveCriarUsuarioComFabricaDeUsuario() {
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("Evelyn", "123.543.765-87", LocalDate.parse("2002-08-26"));

        Assertions.assertEquals("Evelyn", usuario.getNome());

        usuario = fabrica.comEndereco("12345-789", 21, "Apart 334");

        Assertions.assertEquals(21, usuario.getEndereco().getNumero());
    }

    @Test
    public void naoDeveAceitarIdadeMenorQue18Anos() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Usuario("123.456.789-76","Jacque", LocalDate.parse("2024-01-01"), "email@email.com");
        });
    }
}
