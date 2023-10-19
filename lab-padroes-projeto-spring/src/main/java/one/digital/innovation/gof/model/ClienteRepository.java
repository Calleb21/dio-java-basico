package one.digital.innovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Description of ClienteRepository
 * Created by calle on 19/10/2023.
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
