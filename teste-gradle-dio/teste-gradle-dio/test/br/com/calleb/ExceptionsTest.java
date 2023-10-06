package br.com.calleb;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Description of ExceptionsTest
 * Created by calle on 06/10/2023.
 */
public class ExceptionsTest {

    @Test
    public void validaCenarioDeExcecaoNaTransferenciaTest() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("45678", 100);

        TransferenciaEntreContas trasferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                trasferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }
}
