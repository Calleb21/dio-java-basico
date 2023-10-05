package br.com.calleb;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Description of AssertionsTest
 * Created by calle on 05/10/2023.
 */
public class AssertionsTest {

    @Test
    public void validarLancamentoTest() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        Assert.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    public void validarObjetoNuloTest() {
        Pessoa pessoa = null;
        Assert.assertNull(pessoa);

        pessoa = new Pessoa("Calleb", LocalDate.now());
        Assert.assertNotNull(pessoa);
    }
}
