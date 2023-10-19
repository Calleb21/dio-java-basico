package one.digital.innovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Description of EnderecoRepository
 * Created by calle on 19/10/2023.
 */
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
