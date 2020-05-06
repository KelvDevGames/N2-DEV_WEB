package souza.kelvin.projcomh2.model;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@ToString

@Entity
@Table(name="sprite")

public class SpriteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_sprite")
    private long id;

    @Column(name="nome")
    private String nome;

    @Column(name="tamanho")
    private long tamanho;

    @Column(name="valor")
    private double valor;


}
