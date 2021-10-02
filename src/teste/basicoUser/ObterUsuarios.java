/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.basicoUser;

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

//        EntityManagerFactory emf = Persistence
//                .createEntityManagerFactory("exercicios_java");
//        EntityManager em = emf.createEntityManager();
        
        EntityManager manager = JpaUtil.getEntityManager();

        String jpql = "select u from Usuario u";
        TypedQuery<Usuario> query = manager.createQuery(jpql, Usuario.class);
        //query.setMaxResults(3);
        
        List<Usuario> users = query.getResultList();
        
        for(Usuario user: users){
            System.out.println("ID => "+user.getId()
            +"E-mail => "+user.getEmail());
        }
        
        manager.close();
        JpaUtil.close();
    }

}
