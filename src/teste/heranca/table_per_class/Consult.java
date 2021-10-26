/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.heranca.table_per_class;

import teste.heranca.single_table.*;
import infra.DAO;
import java.util.List;
import modelo.heranca.single_table.Carro;
import modelo.heranca.single_table.Esportivo;
import modelo.heranca.table_per_class.Moto;
import modelo.heranca.table_per_class.Nacked;

/**
 *
 * @author tiago
 */
public class Consult {

    //Consulta polimorfica de carro.
    public static void main(String[] args) {

        DAO<Moto> dao = new DAO<>(Moto.class);

        List<Moto> motos = dao.getAll(Integer.MAX_VALUE, 0);

        for (Moto moto1 : motos) {

            if (moto1 instanceof Nacked) {
                System.out.println("+ " + moto1.getModelo()
                        + " - é esportivo, ano " + moto1.getAno());
            } else {
                System.out.println("+ " + moto1.getModelo()
                        + " - é popular, ano " + moto1.getAno());
            }
        }
    }
}
