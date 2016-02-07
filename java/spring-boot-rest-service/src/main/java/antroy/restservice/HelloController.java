package antroy.restservice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/list")
    public List list() {
        List out = new ArrayList<>();
        out.add("Greetings from Spring Boot!");
        return out;
    }

    @RequestMapping("/object")
    public Customer object() {
        Customer out = new Customer();
        out.setName("Bob");
        out.setAddress1("1 Sunset Blvd");
        out.setAddress2("Beverley Hills");
        return out;
    }
}
