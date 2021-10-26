/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.heranca.single_table;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.DiscriminatorType;
import javax.persistence.Id;
import javax.persistence.InheritanceType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author tiago
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("CA")
@Getter
@Setter
public abstract class Carro {

    @Id
    private String placa;

    private String modelo;
    private Integer ano;

    public Carro() {
    }

    public Carro(String placa, String modelo, Integer ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }

}
