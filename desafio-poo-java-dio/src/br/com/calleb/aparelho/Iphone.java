package br.com.calleb.aparelho;

import br.com.calleb.aplicativos.AparelhoTelefonico;
import br.com.calleb.aplicativos.NavegadorInternet;
import br.com.calleb.aplicativos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Aualizando página");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreiorDeVoz() {
        System.out.println("Inicializando o correio de voz");
    }
}
