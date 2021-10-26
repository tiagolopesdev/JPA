/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.heranca.single_table;

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
public class Popular extends Carro {

    private String tipoConsumo;

    public Popular() {
    }

    public Popular(String tipoConsumo, String placa, String modelo, Integer ano) {
        super(placa, modelo, ano);
        this.tipoConsumo = tipoConsumo;
    }

}
