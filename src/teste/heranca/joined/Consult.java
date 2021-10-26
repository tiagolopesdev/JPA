/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.heranca.joined;

import infra.DAO;
import java.util.List;
import modelo.heranca.joined.Funcionario;
import modelo.heranca.joined.Professor;

/**
 *
 * @author tiago
 */
public class Consult {
    
    public static void main(String[] args) {
    
        DAO<Funcionario> dao = new DAO<>(Funcionario.class);
        
        List<Funcionario> fun = dao.getAll(Integer.MAX_VALUE, 0);
        
        for (Funcionario funcionario : fun) {
            
            if (funcionario instanceof Professor) {
                System.out.println("+ "+funcionario.getNome()+" é professor");
            }else{
                System.out.println("+ "+funcionario.getNome()+" é zelador");                
            }
        }
        
    }
}
