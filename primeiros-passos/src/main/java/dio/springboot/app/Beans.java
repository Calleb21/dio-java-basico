package dio.springboot.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * Description of Beans
 * Created by calle on 10/10/2023.
 */
public class Beans {

    @Bean
    @Scope("prototype")
    public Remetente remetente() {
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Digital Innovation One");
        return remetente;
    }
}
