/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.heranca.table_per_class;

import modelo.heranca.single_table.*;
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
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
public abstract class Moto {

    @Id
    private String placa;

    private String modelo;
    private Integer ano;

    public Moto() {
    }

    public Moto(String placa, String modelo, Integer ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }

}
