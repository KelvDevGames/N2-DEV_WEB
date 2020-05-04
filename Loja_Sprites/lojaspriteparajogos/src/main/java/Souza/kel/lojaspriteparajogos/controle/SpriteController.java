package Souza.kel.lojaspriteparajogos.controle;

import Souza.kel.lojaspriteparajogos.modelo.Sprite;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SpriteController {

@GetMapping("/sprite")
public Sprite getSprite() {

    Sprite sprite = new Sprite();

    sprite.setId_sprite(105);
    sprite.setNome_sprite("Ring Oriun");
    sprite.setAssunto_sprite("Sprite de uma asa");
    sprite.setTamanho_sprite(150);
    sprite.setValor_sprite(69);

    return sprite;
}
    @GetMapping("/cadastro")
    public ArrayList<Sprite> getMensagem() {

    Sprite  spriteone = new Sprite();

    spriteone.setId_sprite(102);
    spriteone.setNome_sprite("Asa de ijim");
    spriteone.setAssunto_sprite("asas de um boss de rune...");
    spriteone.setValor_sprite(500);
    spriteone.setTamanho_sprite(509);

    Sprite spritetwo = new Sprite();

    spritetwo.setId_sprite(103);
    spritetwo.setNome_sprite("Hat da Bruxa");
    spritetwo.setAssunto_sprite("Hat de uma Bruxa da floresta...");
    spritetwo.setValor_sprite(459);
    spritetwo.setTamanho_sprite(408);

    ArrayList<Sprite> cadastro = new ArrayList<>();

    cadastro.add(spriteone);
    cadastro.add(spritetwo);

    return cadastro;

    }


}
