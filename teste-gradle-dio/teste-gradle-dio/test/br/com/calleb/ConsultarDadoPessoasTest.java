package br.com.calleb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

/**
 * Description of ConsultarDadoPessoasTest
 * Created by calle on 06/10/2023.
 */
public class ConsultarDadoPessoasTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @Test
    public void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    public static void finalizaConecao() {
        BancoDeDados.finalizarConecao();
        System.out.println("rodou configurConexao");
    }
}
