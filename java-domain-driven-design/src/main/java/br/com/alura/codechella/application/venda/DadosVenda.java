package br.com.alura.codechella.application.venda;

import java.util.List;

import br.com.alura.codechella.application.ingresso.DadosTipoIngresso;
import br.com.alura.codechella.application.usuario.DadosUsuario;

public record DadosVenda(
        Long id,
        DadosUsuario usuario,
        List<DadosTipoIngresso> ingressos
) {
}
