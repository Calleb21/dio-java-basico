package br.com.calleb;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

/**
 * Description of CondicionaisTest
 * Created by calle on 06/10/2023.
 */
public class CondicionaisTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "calle")
    public void validarAlgoSomenteNoUsuarioCalle() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "calle")
    public void validarAlgoSomenteNoUsuarioCalleb() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
