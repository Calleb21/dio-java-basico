package br.com.calleb.lanchonete;

import br.com.calleb.lanchonete.area.cliente.Cliente;
import br.com.calleb.lanchonete.atendimento.Atendente;
import br.com.calleb.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        
		Cozinheiro cozinheiro = new Cozinheiro();

		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Atendente atendente = new Atendente();
		atendente.receberPagamento();
		atendente.servindoMesa();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
	}
}
