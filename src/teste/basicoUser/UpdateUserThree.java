/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.basicoUser;

import infra.JpaUtil;
import javax.persistence.EntityManager;
import modelo.basico.Usuario;

/**
 *
 * @author tiago
 */
public class UpdateUserThree {

    public static void main(String[] args) {

        EntityManager manager = JpaUtil.getEntityManager();

        manager.getTransaction().begin();

        Usuario user = manager.find(Usuario.class, 4);
        user.setNome("Lucas");

        manager.detach(user);
        
        manager.merge(user);
        
        manager.getTransaction().commit();
        
        manager.close();
        JpaUtil.close();
    }
}
