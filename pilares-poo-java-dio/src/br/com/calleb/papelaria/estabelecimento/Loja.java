package br.com.calleb.papelaria.estabelecimento;

import br.com.calleb.papelaria.equipamentos.Digitalizadora.Digitalizadora;
import br.com.calleb.papelaria.equipamentos.copiadora.Copiadora;
import br.com.calleb.papelaria.equipamentos.impressora.Impressora;
import br.com.calleb.papelaria.equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Loja {

    public static void main(String[] args) {

        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
