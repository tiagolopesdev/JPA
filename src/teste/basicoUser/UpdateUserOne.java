/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.basicoUser;

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
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        
        tx.begin();
        
        Usuario user = manager.find(Usuario.class, 4);
        System.out.println("Nome: "+user.getNome());
        
        user.setNome("Clara");
        user.setEmail("clara@gmail.com");
        
        manager.merge(user);
        
        manager.getTransaction().commit();
        
        manager.close();
        JpaUtil.close();
    }

}
