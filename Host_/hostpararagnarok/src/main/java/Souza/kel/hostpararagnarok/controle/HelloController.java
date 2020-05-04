package Souza.kel.hostpararagnarok.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getMensagem() {
        return "Oi, estou iniciando com host.";
    }

}
