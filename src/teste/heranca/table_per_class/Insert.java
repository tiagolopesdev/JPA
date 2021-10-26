/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.heranca.table_per_class;

import teste.heranca.single_table.*;
import infra.DAO;
import java.util.Arrays;
import java.util.List;
import modelo.heranca.single_table.Carro;
import modelo.heranca.single_table.Esportivo;
import modelo.heranca.single_table.Popular;
import modelo.heranca.table_per_class.Casual;
import modelo.heranca.table_per_class.Moto;
import modelo.heranca.table_per_class.Nacked;

/**
 *
 * @author tiago
 */
public class Insert {

    public static void main(String[] args) {

        DAO<Moto> dao = new DAO<>(Moto.class);

        Nacked e1 = new Nacked(600, "435ERS", "CBR", 2018);
        Nacked e2 = new Nacked(1000, "435ETS", "CB1000", 2019);
        Nacked e3 = new Nacked(800, "412GHS", "Mt09", 2017);

        Casual c1 = new Casual("Gasolina", "345678", "Pop110", 2018);
        Casual c2 = new Casual("Flex", "761233", "Titan", 2017);
        Casual c3 = new Casual("Gasolina", "094522", "Biz", 2015);

        List<Moto> insert = Arrays.asList(e1, e2, e3, c1, c2, c3);

//        dao.OpenTransction();
//        
//        for (Moto moto : insert) {
//            dao.include(moto);
//        }
//        
//        dao.CloseTransction().closeDAO();
    }
}
