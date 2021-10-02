/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.oneToOne;

import infra.DAO;
import modelo.oneToOne.Cliente;

/**
 *
 * @author tiago
 */
public class GetClienteAssento {
    
    public static void main(String[] args) {
        
        DAO<Cliente> dao = new DAO<>(Cliente.class);
        
        Cliente cliente = dao.getOneId(3L);
        
        System.out.println("Assento "+cliente.getAssento().getNome()+""
                + " do cliente "+cliente.getAssento().getCliente().getNome());
    }
}
