package antroy.restservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class GoodbyeController {
    @RequestMapping("/bye")
    public String index() {
        return "Farewell from Spring Boot!";
    }
}
