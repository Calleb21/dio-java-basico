import br.com.calleb.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Description of PessoaTest
 * Created by calle on 05/10/2023.
 */
public class PessoaTest {

    @Test
    public void validarIdadeTest() {
        Pessoa pessoa = new Pessoa("Calleb", LocalDate.of(2020, 1, 1));
        Assert.assertEquals(3, pessoa.getIdade());
    }
}
