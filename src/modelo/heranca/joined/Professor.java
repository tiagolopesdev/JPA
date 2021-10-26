/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.heranca.joined;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author tiago
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
@Getter
@Setter
public class Professor extends Funcionario {

    private String materia;
    
    private Integer qntAulas;

    public Professor() {
    }

    public Professor(String materia, Integer qntAulas, String nome, Integer idade) {
        super(nome, idade);
        this.materia = materia;
        this.qntAulas = qntAulas;
    }

}
