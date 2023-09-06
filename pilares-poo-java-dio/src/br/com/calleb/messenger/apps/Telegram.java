package br.com.calleb.messenger.apps;

import br.com.calleb.messenger.ServicoMensagemInstantanea;

public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando menssagem pelo Telegram");

    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo menssagem pelo Telegram");
    }
}
