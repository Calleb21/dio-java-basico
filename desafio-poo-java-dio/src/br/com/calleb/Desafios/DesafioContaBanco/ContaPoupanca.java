package br.com.calleb.Desafios.DesafioContaBanco;

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("\nTaxa de juros: " + taxaJuros + "%");
    }
}
