/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.heranca.table_per_class;

import modelo.heranca.single_table.*;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author tiago
 */
@Entity
@DiscriminatorValue(value = "PO")
@Getter
@Setter
public class Casual extends Moto {

    private String tipoConsumo;

    public Casual() {
    }

    public Casual(String tipoConsumo, String placa, String modelo, Integer ano) {
        super(placa, modelo, ano);
        this.tipoConsumo = tipoConsumo;
    }

}
