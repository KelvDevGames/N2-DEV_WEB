package Souza.kel.lojadedicadaajogos.modelo;

import lombok.*;

/**
 @author Dev.CodKey.Kel
 @since 04/05/2020 04:26
 @version loja codkey 1.0.0
*/

@ToString //comentário ToString = monstrar os dados do objeto
@AllArgsConstructor //método construct com argumentos
@NoArgsConstructor //médoto construct sem argumentos
public class Script {

    @Getter @Setter
    private int id_script;
    @Getter @Setter
    private String descricao;
    @Getter @Setter
    private String linguagem;
    @Getter @Setter
    private float tamanho;
    @Getter @Setter
    private double valor;

}
