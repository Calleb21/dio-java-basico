package br.com.calleb;

/**
 * Description of TransferenciaEntreContas
 * Created by calle on 06/10/2023.
 */
public class TransferenciaEntreContas {

    public void transfere(Conta contaOrigem, Conta contaDestino, int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior quer zero");
        }
    }
}
