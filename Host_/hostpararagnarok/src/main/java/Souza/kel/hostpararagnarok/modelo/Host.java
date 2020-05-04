package Souza.kel.hostpararagnarok.modelo;

import groovy.transform.ToString;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;

/**
 @author Dev.Codkey.Kel
 */


@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Host {

    @Getter @Setter
    private int id_plano;
    @Getter @Setter
    private String nome_host;
    @Getter @Setter
    private String tipo_plano;
    @Getter @Setter
    private double valor_host;
    @Getter @Setter
    private String nome_clint_dominio;
    @Getter @Setter
    private String login_cliente;
    @Getter @Setter
    private String senha_client;



}
