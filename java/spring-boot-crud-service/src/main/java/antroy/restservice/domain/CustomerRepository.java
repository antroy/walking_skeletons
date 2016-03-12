package antroy.restservice.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ant on 09/03/16.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findById(Long id);
}
