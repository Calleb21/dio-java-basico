package br.com.calleb;

/**
 * Description of Conta
 * Created by calle on 06/10/2023.
 */
public class Conta {

    private String numeroConta;
    private int saldo;

    public Conta(String numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }
}
