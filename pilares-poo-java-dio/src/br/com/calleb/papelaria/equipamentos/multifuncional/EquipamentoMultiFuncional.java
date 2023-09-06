package br.com.calleb.papelaria.equipamentos.multifuncional;

import br.com.calleb.papelaria.equipamentos.Digitalizadora.Digitalizadora;
import br.com.calleb.papelaria.equipamentos.copiadora.Copiadora;
import br.com.calleb.papelaria.equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento MultiFuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento MultiFuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimir via equipamento MultiFuncional");
    }
}
