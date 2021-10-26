/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.basicoUser;

import infra.DAO;
import infra.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import modelo.basico.Usuario;

/**
 *
 * @author tiago
 */
public class ObterUsuarios {

    public static void main(String[] args) {

        DAO<Usuario> dao = new DAO<>(Usuario.class);

        List<Usuario> list = dao.getAll(Integer.MAX_VALUE, 0);

        for (Usuario usuario : list) {
            System.out.println(usuario.getNome() + " tem o email "
                    + "" + usuario.getEmail());
        }

    }

}
