/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.basicoUser;

import infra.DAO;
import infra.JpaUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Product;
import modelo.basico.Usuario;

/**
 *
 * @author tiago
 */
public class ObterUsuario {

    public static void main(String[] args) {
        
        DAO<Usuario> dao = new DAO<>(Usuario.class);
        
        System.out.println(dao.getOneId(10).getNome());
        dao.closeDAO();
    }
}
