package antroy.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    public AppConfig getConfig() {
        return config;
    }

    @Autowired
    public void setConfig(AppConfig config) {
        this.config = config;
    }

    private AppConfig config;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/conf")
    public String conf() {
        return "Greetings from " + config.getName() + "!";
    }

    @RequestMapping("/get/{id}")
    public String getId(@PathVariable("id") long id) {
        return "Greetings from Spring Boot with id " + id;
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

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String post() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/postwithbody", method = RequestMethod.POST, consumes = "application/json")
    public String postWithData(@RequestBody Customer customer) {
        return "User " + customer.getName() + " Created";
    }
}
