package Souza.kel.lojadedicadaajogos.controle;

import Souza.kel.lojadedicadaajogos.modelo.Script;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class ScriptController {

    @GetMapping("/script")
    public Script getScript() {

        Script script = new Script();

        script.setId_script(1);
        script.setLinguagem("C#");
        script.setTamanho(100);
        script.setValor(50);
        script.setDescricao("Callfunc faz nevaar o mapa...");

        return script;
    }

    @GetMapping("/cadastro")
    public ArrayList<Script> getCadastro() {

        Script scriptone = new Script();

        scriptone.setId_script(2);
        scriptone.setLinguagem("C++");
        scriptone.setTamanho(200);
        scriptone.setValor(10);
        scriptone.setDescricao("NPC de Heal...");

        Script scripttwo = new Script();

        scriptone.setId_script(3);
        scriptone.setLinguagem("C#");
        scriptone.setTamanho(250);
        scriptone.setValor(59);
        scriptone.setDescricao("NPC Arena de guerra com narrador de guerra...");

        ArrayList<Script> cadastro = new ArrayList<>();

        cadastro.add(scriptone);
        cadastro.add(scripttwo);

        return cadastro;
    }
}
