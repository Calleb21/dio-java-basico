package br.com.calleb;

import java.util.logging.Logger;

/**
 * Description of BancoDeDados
 * Created by calle on 06/10/2023.
 */
public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConecao() {
        LOGGER.info("Finalizou conexao");
    }
}
