package br.com.calleb.atividades;

/**
 * @author Calleb
 */
public class SmartTv {
    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTv(boolean ligada, int canal, int volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        if (canal >= 0 && canal <= 500) {
            System.out.println("Você está assistindo o canal: " + canal);
        } else {
            System.out.println("Canal inválido");
        }
    }

    public void nivelVolume(int novoVolume) {
        volume = novoVolume;
        if (volume >= 0 && volume <= 100) {
            System.out.println("O volume é: " + volume);
        } else {
            System.out.println("Volume inválido");
        }
    }

    public void ligar() {
        ligada = true;
        System.out.println("Ligando a TV");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Desligando a TV");
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
