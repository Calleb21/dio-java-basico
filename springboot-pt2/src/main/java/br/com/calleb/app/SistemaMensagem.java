package br.com.calleb.app;

import br.com.calleb.app.Remetente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Description of SistemaMensagem
 * Created by calle on 10/10/2023.
 */
@Component
public class SistemaMensagem implements CommandLineRunner {

    @Autowired
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensafem enviada por: " + remetente.getNome()
                + "\nE-mail: " + remetente.getEmail()
                + "\nCom telefone para contato: " + remetente.getTelefones());
        System.out.println("Seu cadastro foi aprovado");
    }
}
