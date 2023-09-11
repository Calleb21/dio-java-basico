package br.com.calleb.operacaoBasicaMap.agenda;

public class Main {
    
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Calleb", 3654766);
        agendaContatos.adicionarContato("Calleb Camargo", 3547766);
        agendaContatos.adicionarContato("Calleb", 6375477);
        agendaContatos.adicionarContato("Rayane", 456736);

        agendaContatos.exibirContato();
        agendaContatos.removerContato("Calleb");
        agendaContatos.exibirContato();
    }
}
