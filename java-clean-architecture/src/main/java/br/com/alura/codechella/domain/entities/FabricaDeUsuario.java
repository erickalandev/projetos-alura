package br.com.alura.codechella.domain.entities;

import java.time.LocalDate;

import br.com.alura.codechella.domain.Endereco;

public class FabricaDeUsuario {
    private Usuario usuario;

    public Usuario comNomeCpfNascimento(String nome, String cpf, LocalDate nascimento) {
        this.usuario = new Usuario(cpf, nome, nascimento, "");
        return this.usuario;
    }

    public Usuario comEndereco(String cep, Integer numero, String complemento) {
        this.usuario.setEndereco(new Endereco(cep, numero, complemento));
        return this.usuario;
    }
}
