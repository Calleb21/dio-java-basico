package br.com.calleb.messenger;

import br.com.calleb.messenger.apps.Facebook;
import br.com.calleb.messenger.apps.MSNMessenger;
import br.com.calleb.messenger.apps.Telegram;

public class Computador {

    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "fbm";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new Facebook();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
