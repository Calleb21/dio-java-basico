package br.com.calleb;

import br.com.calleb.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Description of br.com.calleb.PessoaTest
 * Created by calle on 05/10/2023.
 */
public class PessoaTest {

    @Test
    public void validarIdadeTest() {
        Pessoa pessoa = new Pessoa("Calleb", LocalDate.of(2020, 1, 1));
        Assert.assertEquals(3, pessoa.getIdade());
    }

    @Test
    public void validarIdaddeTest() {
        Pessoa pessoa = new Pessoa("Calleb", LocalDate.of(2004, 4, 11));
        Assert.assertEquals(19, pessoa.getIdade());
    }

    @Test
    public void retornarSeMaiorIdadeTest() {
        Pessoa pessoa = new Pessoa("Calleb", LocalDate.of(2004, 4, 11));
        Assert.assertTrue(pessoa.ehMaiorDeIdade());
    }
}
