/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.heranca.joined;

import infra.DAO;
import java.util.Arrays;
import java.util.List;
import modelo.heranca.joined.Funcionario;
import modelo.heranca.joined.Professor;
import modelo.heranca.joined.Zelador;

/**
 *
 * @author tiago
 */
public class Insert {

    public static void main(String[] args) {

        DAO<Funcionario> dao = new DAO<>(Funcionario.class);

        Professor p1 = new Professor("Matemática", 5, "Alberto", 32);
        Professor p2 = new Professor("Física", 4, "Junior", 45);
        Professor p3 = new Professor("Artes", 2, "Bia", 28);
        Professor p4 = new Professor("História", 4, "José", 47);

        Zelador z1 = new Zelador("limpeza banheiro", "Lucas", 50);
        Zelador z2 = new Zelador("limpeza salas", "Assis", 40);
        Zelador z3 = new Zelador("limpeza laboratorio", "Gui", 30);
        Zelador z4 = new Zelador("limpeza refeitorio", "Antonio", 55);

        List<Funcionario> fun = Arrays.asList(p1, p2, p3, p4, z1, z2, z3, z4);

//        dao.OpenTransction();
//
//        for (Funcionario funcionario : fun) {
//            dao.include(funcionario);
//        }
//
//        dao.CloseTransction().closeDAO();

    }
}
