package sangali.com.publisher_jpa.repositories;

import org.springframework.data.repository.CrudRepository;
import sangali.com.publisher_jpa.domain.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
