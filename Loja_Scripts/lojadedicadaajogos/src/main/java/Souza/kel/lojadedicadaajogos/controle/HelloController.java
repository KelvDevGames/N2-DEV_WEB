package Souza.kel.lojadedicadaajogos.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getMensagem() {
        return "Olá, iniciando sobre meus scripts...";
    }

}
