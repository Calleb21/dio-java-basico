package dio.web.api.handler;

/**
 * Description of BusinessException
 * Created by calle on 13/10/2023.
 */
public class BusinessException extends RuntimeException {
    public BusinessException(String mensagem) {
        super(mensagem);
    }

    public BusinessException(String mensagem, Object... params) {
        super(String.format(mensagem, params));
    }
}