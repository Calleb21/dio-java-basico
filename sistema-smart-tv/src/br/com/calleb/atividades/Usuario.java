package br.com.calleb.atividades;

/**
 * @author Calleb
 */
public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println();

        smartTv.ligar();
        smartTv.mudarCanal(22);
        smartTv.aumentaVolume();
        smartTv.aumentaVolume();
        smartTv.aumentaVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.desligar();
    }
}
