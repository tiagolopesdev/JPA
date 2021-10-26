/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.heranca.single_table;

import infra.DAO;
import java.util.List;
import modelo.heranca.single_table.Carro;
import modelo.heranca.single_table.Esportivo;

/**
 *
 * @author tiago
 */
public class Consult {

    //Consulta polimorfica de carro.
    
    public static void main(String[] args) {

        DAO<Carro> dao = new DAO<>(Carro.class);

        List<Carro> carro = dao.getAll(Integer.MAX_VALUE, 0);

        for (Carro carro1 : carro) {

            if (carro1 instanceof Esportivo) {
                System.out.println("+ "+carro1.getModelo() + 
                        " - é esportivo, ano "+carro1.getAno());
            } else {
                System.out.println("+ "+carro1.getModelo() + 
                        " - é popular, ano "+carro1.getAno());
            }
        }

    }
}
