package com.estags.estagsdiaries.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data  //lombok
@Entity
@Builder  //lonbok
@NoArgsConstructor  //lombok
@AllArgsConstructor  //lombok
@Table(name = "DIARY")  //automaticamente cria no BD uma tabela com esse nome
public class Diary {  //esse objeto também representa o modelo da tabela que vai pro BD

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;
    private String sentimento;


}
