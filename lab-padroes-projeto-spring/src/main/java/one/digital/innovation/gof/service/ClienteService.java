package one.digital.innovation.gof.service;

import one.digital.innovation.gof.model.Cliente;
import org.springframework.stereotype.Service;

/**
 * Description of ClienteService
 * Created by calle on 19/10/2023.
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
