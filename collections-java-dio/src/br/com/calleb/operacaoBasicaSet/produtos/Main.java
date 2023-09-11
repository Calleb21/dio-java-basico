package br.com.calleb.operacaoBasicaSet.produtos;

public class Main {

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1l, "Produto 1", 34d, 3);
        cadastroProdutos.adicionarProduto(3l, "Produto 4", 23.3d, 23);
        cadastroProdutos.adicionarProduto(8l, "Produto 3", 32, 4);
        cadastroProdutos.adicionarProduto(2l, "Produto 2", 53.43, 5);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println("\n" + cadastroProdutos.exibirProdutosPorNome());
        System.out.println("\n" + cadastroProdutos.exibirProdutosPorPreco());
    }
}
