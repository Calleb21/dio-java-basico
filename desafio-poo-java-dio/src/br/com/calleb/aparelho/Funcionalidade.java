package br.com.calleb.aparelho;

public class Funcionalidade {
    
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Navegador de Internet: ");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("\nTelefone: ");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreiorDeVoz();

        System.out.println("\nReprodutor Musical: ");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
