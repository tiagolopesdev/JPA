/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.basicoUser;

import infra.DAO;
import infra.JpaUtil;
import javax.persistence.EntityManager;
import modelo.basico.Usuario;

/**
 *
 * @author tiago
 */
public class RemoveUser {
    public static void main(String[] args) {
        
//        EntityManager manager = JpaUtil.getEntityManager();
//        
//        Usuario user = manager.find(Usuario.class, 4);
//        
//        if (user != null) {
//            manager.remove(user);
//            manager.getTransaction().begin();
//            manager.getTransaction().commit();
//        }
//        
//        manager.close();
//        JpaUtil.close();
        Usuario user = new Usuario();
        DAO<Usuario> infraUser = new DAO<>(Usuario.class);
        
        infraUser.OpenTransction();
        
        infraUser.Remove(user, 13);
        
        infraUser.CloseTransction();
    }
}
