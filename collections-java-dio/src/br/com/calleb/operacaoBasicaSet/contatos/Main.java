package br.com.calleb.operacaoBasicaSet.contatos;

public class Main {
    
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Calleb", 346457);
        agendaContatos.adicionarContato("Rayane", 23456);
        agendaContatos.adicionarContato("Calleb Camargo", 87606);
        agendaContatos.adicionarContato("Lopes Rayane", 986756);
      
        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarContatos("Calleb"));
    }
}
