package subsistema2.cep;

/**
 * Description of CepApi
 * Created by calle on 18/10/2023.
 */
public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Caldas Novas";
    }

    public String recuperarEstado(String cep) {
        return "GO";
    }
}