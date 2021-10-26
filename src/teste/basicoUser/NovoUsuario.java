/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.basicoUser;

import infra.DAO;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Usuario;

/**
 *
 * @author tiago
 */
public class NovoUsuario {

    public static void main(String[] args) {
        
        Usuario newUser = new Usuario("Lopes", "lopes@gmail.com");
        Usuario newUser1 = new Usuario("Djalma", "djalma@gmail.com");
        Usuario newUser2 = new Usuario("Carlos", "carlo@gmail.com");
        Usuario newUser3 = new Usuario("Geovana", "geovana@gmail.com");
        Usuario newUser4 = new Usuario("Ana", "ana@gmail.com");
        Usuario newUser5 = new Usuario("Bia", "bia@gmail.com");

        List<Usuario> users = Arrays.asList(newUser, newUser1, newUser2, newUser3, 
                newUser4, newUser5);
        
        DAO<Usuario> infra = new DAO<>(Usuario.class);
        
        infra.OpenTransction();
        
        for (Usuario user : users) {
            infra.include(user);
        }
        
        infra.CloseTransction().closeDAO();

    }
}
