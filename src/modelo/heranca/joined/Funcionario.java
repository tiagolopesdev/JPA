/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.heranca.joined;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author tiago
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

}
