package br.com.everson.SpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data

public class Aluno {

    @Id
    private Long matricula;
    private String nome;
    private String telefone;
    private String email;
    private Instant dataCadastro;



}
