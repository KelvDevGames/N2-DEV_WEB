package Souza.kel.lojaspriteparajogos.modelo;

import groovy.transform.ToString;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 @author Dev.Codkey.Kel
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Sprite {

@Getter @Setter
    private int id_sprite;
@Getter @Setter
    private String nome_sprite;
@Getter @Setter
    private String assunto_sprite;
@Getter @Setter
    private float tamanho_sprite;
@Getter @Setter
    private double valor_sprite;


}
