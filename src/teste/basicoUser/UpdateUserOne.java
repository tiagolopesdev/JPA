/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.basicoUser;

import infra.DAO;
import infra.JpaUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import modelo.basico.Usuario;

/**
 *
 * @author tiago
 */
public class UpdateUserOne {

    public static void main(String[] args) {

        DAO<Usuario> dao = new DAO<>(Usuario.class);

        dao.OpenTransction();

        Usuario user = dao.getOneId(8);

        System.out.println(user.getNome() + " Registro a ser alterado\n");

        user.setNome("João Gustavo");
        user.setEmail("joaoGustavo@gmail.com");

        dao.Update(user);

        System.out.println(user.getNome()+" - alteração");
        
        dao.CloseTransction().closeDAO();

    }

}
