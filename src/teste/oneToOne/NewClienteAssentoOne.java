/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.oneToOne;

import infra.DAO;
import modelo.oneToOne.Assento;
import modelo.oneToOne.Cliente;

/**
 *
 * @author tiago
 */
public class NewClienteAssentoOne {
      
    public static void main(String[] args) {
        
        Assento assento = new Assento("6C");
        Cliente c1 = new Cliente("Lucas", assento);
        
        DAO<Object> daoA = new DAO<>(Object.class);
        //DAO<Cliente> daoC = new DAO<>(Cliente.class);
        
        daoA.OpenTransction()
                .include(assento)
                .include(c1)
                .CloseTransction()
                .closeDAO();
                
    }
    
}
