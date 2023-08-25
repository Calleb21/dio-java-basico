package br.com.calleb.atividades;

/**
 * @author Calleb
 */
public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv(false, 0, 0);

        System.out.println("TV ligada: " + smartTv.isLigada());
        System.out.println("Canal atual: " + smartTv.getCanal());
        System.out.println("Volume atual: " + smartTv.getVolume());
        System.out.println();

        smartTv.ligar();
        smartTv.mudarCanal(22);
        smartTv.nivelVolume(100);
        smartTv.desligar();
    }
}
