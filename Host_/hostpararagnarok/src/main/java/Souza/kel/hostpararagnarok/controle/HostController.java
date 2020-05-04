package Souza.kel.hostpararagnarok.controle;

import Souza.kel.hostpararagnarok.modelo.Host;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HostController {

    @GetMapping("/host")
    public Host getMensagem() {
        Host hostdominio = new Host();

        hostdominio.setId_plano(10);
        hostdominio.setNome_host("Codkey Host");
        hostdominio.setNome_clint_dominio("Kelvin Souza");
        hostdominio.setTipo_plano("5 meses");
        hostdominio.setValor_host(500);
        hostdominio.setLogin_cliente("kvjson963");
        hostdominio.setSenha_client("54321kszhstcdk");

        return hostdominio;
    }

    @GetMapping("/cadastro")
    public ArrayList<Host> getCadastro() {

        Host hostdomnioone = new Host();

        hostdomnioone.setId_plano(11);
        hostdomnioone.setNome_host("Codkey Hosone");
        hostdomnioone.setNome_clint_dominio("Kelvin Silva");
        hostdomnioone.setTipo_plano("4 meses");
        hostdomnioone.setValor_host(420);
        hostdomnioone.setLogin_cliente("kvdsjson963");
        hostdomnioone.setSenha_client("54321ddddskszhstcdk");

        Host hostdomniotwo = new Host();

        hostdomniotwo.setId_plano(11);
        hostdomniotwo.setNome_host("Codkey Hostwo");
        hostdomniotwo.setNome_clint_dominio("Kelvin Silva");
        hostdomniotwo.setTipo_plano("4 meses");
        hostdomniotwo.setValor_host(420);
        hostdomniotwo.setLogin_cliente("kvdsjson963");
        hostdomniotwo.setSenha_client("54321ddddskszhstcdk");

        ArrayList<Host> cadastro = new ArrayList<>();

        cadastro.add(hostdomniotwo);


        return cadastro;
    }

}
