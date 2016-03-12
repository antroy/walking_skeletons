package antroy.restservice;

import antroy.restservice.domain.Customer;
import antroy.restservice.domain.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.LinkedList;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository repository;

    @RequestMapping("/customer")
    public Collection<Customer> getCustomers() {
        return repository.findAll();
    }

    @RequestMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable("id") long id) {
        return repository.findById(id);
    }

    @RequestMapping(value = "/customer", method = RequestMethod.POST, consumes = "application/json")
    public Long newCustomer(@RequestBody Customer customer) {
        return repository.save(customer).getId();
    }
}
