package br.com.calleb.corrida;

public class Carro extends Veiculo {

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("O carro está ligado.");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo o combústivel");
    }

    private void confereCambio() {
        System.out.println("Conferindo câmbio em neutro");
    }
}
