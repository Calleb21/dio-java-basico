package br.com.calleb.condicionais;

/**
 * @author Calleb
 */
public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSalario = 26.0;

        if (valorSalario < saldo) {
            saldo = saldo - valorSalario;
        }

        System.out.println(saldo);
    }

}
