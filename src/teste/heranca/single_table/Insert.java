/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.heranca.single_table;

import infra.DAO;
import java.util.Arrays;
import java.util.List;
import modelo.heranca.single_table.Carro;
import modelo.heranca.single_table.Esportivo;
import modelo.heranca.single_table.Popular;

/**
 *
 * @author tiago
 */
public class Insert {

    public static void main(String[] args) {

        DAO<Carro> dao = new DAO<>(Carro.class);

        
        Esportivo e1 = new Esportivo(120, "435ERS", "Mustagem", 2018, "vidro eletrico");
        Esportivo e2 = new Esportivo(150, "789ETS", "A3", 2016, "turbo");
        Esportivo e3 = new Esportivo(200, "093KJF", "Lamborguine", 2019, "turbo");
        Esportivo e4 = new Esportivo(160, "724UQD", "Ferrari", 2020, "turbo");
        
        Popular p1 = new Popular("Gasolina", "344PIK", "Celta", 2014);
        Popular p2 = new Popular("Disel", "374POK", "Siena", 2015);
        Popular p3 = new Popular("Gasolina", "324POP", "Gol", 2012);
        Popular p4 = new Popular("Gasolina", "428WDS", "FordK", 2013);

        List<Carro> insert = Arrays.asList(e1, e2, e3, e4, p1, p2, p3, p4);
        
//        dao.OpenTransction();
//        
//        for (Carro carro : insert) {
//            dao.include(carro);
//        }
//        
//        dao.CloseTransction().closeDAO();
                
    }
}
