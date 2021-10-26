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
@DiscriminatorValue(value = "ES")
@Getter
@Setter
public class Esportivo extends Carro {

    private Integer potencia;
    private String diferencial;

    public Esportivo() {
    }

    public Esportivo(Integer potencia, String placa, String modelo, Integer ano, String diferencial) {
        super(placa, modelo, ano);
        this.potencia = potencia;
        this.diferencial = diferencial;
    }

}
