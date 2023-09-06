package br.com.calleb.corrida;

public class Autodromo {

    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("2373427");
        jeep.ligar();

        System.out.println();

        Moto ktm = new Moto();
        ktm.setChassi("3242876");
        ktm.ligar();
    }
}
