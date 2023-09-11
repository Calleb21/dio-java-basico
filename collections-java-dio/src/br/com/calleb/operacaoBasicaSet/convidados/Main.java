package br.com.calleb.operacaoBasicaSet.convidados;

public class Main {

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados.");

        conjuntoConvidados.adicionarConvidado("Luana", 21);
        conjuntoConvidados.adicionarConvidado("Luana", 22);
        conjuntoConvidados.adicionarConvidado("Calleb", 32);
        conjuntoConvidados.adicionarConvidado("Rayane", 2);
        conjuntoConvidados.adicionarConvidado("João", 43);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(22);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados.");
    }
}
