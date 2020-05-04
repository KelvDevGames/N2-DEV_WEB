package Souza.kel.lojaspriteparajogos.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getMensagem() { return "Olá, aqui inicia as sprites..."; };



}
