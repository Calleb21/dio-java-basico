package br.com.calleb.operacaoBasicaMap.produtos;

public class Main {
    
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibitProdutos();
        estoqueProdutos.adicionarProduto(2l, "Produto1", 36.34d, 2);
        estoqueProdutos.adicionarProduto(1l, "Produto2", 645.8d, 2);
        estoqueProdutos.adicionarProduto(23l, "Produto3", 34.7d, 64);
        estoqueProdutos.adicionarProduto(6l, "Produto4", 576.7d, 78);

        estoqueProdutos.exibitProdutos();
        System.out.println("\nValor total no estoque: R$:" + estoqueProdutos.calculaValorTotalEstoque());
        System.out.println("\nProduto mais caro: R$:" + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("\nProduto mais barato: R$:" + estoqueProdutos.obterProdutoMaisBarato());
    }
}
