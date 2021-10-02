/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.oneToMany;

import infra.DAO;
import modelo.onToMany.ItemPedido;
import modelo.onToMany.Pedido;

/**
 *
 * @author tiago
 */
public class getOrders {
    
    public static void main(String[] args) {
        
        DAO<Pedido> dao = new DAO<>(Pedido.class);
        
        Pedido pedido = dao.getOneId(1L);
        
        for (ItemPedido item : pedido.getItens()) {
            System.out.println("Pedido: "+item.getProduto().getNome()+", quantidade "+item.getQuantidade());
        }
    }
}
