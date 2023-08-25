package br.com.calleb.atividades;

/**
 * @author Calleb
 */
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Você está assistindo o canal: " + canal);
    }

    public void aumentaVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }


    public void ligar() {
        ligada = true;
        System.out.println("Ligando a TV");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Desligando a TV");
    }
}
