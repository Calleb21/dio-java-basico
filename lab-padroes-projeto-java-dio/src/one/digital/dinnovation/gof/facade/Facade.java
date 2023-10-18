package one.digital.dinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

/**
 * Description of Facade
 * Created by calle on 18/10/2023.
 */
public class Facade {

   public void migrarCliente(String nome, String cep) {
      String cidade = CepApi.getInstancia().recuperarCidade(cep);
      String estado = CepApi.getInstancia().recuperarEstado(cep);

      CrmService.gravarCliente(nome, cep, cidade, estado);
   }
}
