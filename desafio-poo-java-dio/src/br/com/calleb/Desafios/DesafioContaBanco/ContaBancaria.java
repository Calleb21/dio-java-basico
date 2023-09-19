package br.com.calleb.desafios.desafioContaBanco;

class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.println(titular);
        System.out.println(numero);
        System.out.printf("Saldo: R$ %.1f", saldo);
    }
}
