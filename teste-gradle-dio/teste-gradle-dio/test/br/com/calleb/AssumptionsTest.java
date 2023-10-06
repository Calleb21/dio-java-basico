package br.com.calleb;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

/**
 * Description of AssumptionsTest
 * Created by calle on 06/10/2023.
 */
public class AssumptionsTest {

    @Test
    public void validarAlgoSomenteNoUsuarioCalle() {
        Assumptions.assumeFalse("calle".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
