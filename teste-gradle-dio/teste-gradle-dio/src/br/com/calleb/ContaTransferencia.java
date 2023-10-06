package br.com.calleb;

/**
 * Description of ContaTransferencia
 * Created by calle on 06/10/2023.
 */
public class ContaTransferencia {

    public void transefere(Conta contaOrigem, Conta contaDestino, int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deverá ser maior que 0");
        }
    }
}
