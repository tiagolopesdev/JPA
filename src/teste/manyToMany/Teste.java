/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.manyToMany;

import infra.DAO;
import modelo.manyToMany.Comercio;
import modelo.manyToMany.Produto;

/**
 *
 * @author tiago
 */
public class Teste {
    public static void main(String[] args) {
        Comercio c1 = new Comercio("Varejão", "Rua 2", 345678123);
        
        Produto p1 = new Produto("Nescau", 3.50);
        Produto p2 = new Produto("Ovo maltino", 3.00);
        
        c1.Adicionar(p1);
        c1.Adicionar(p2);
        
        DAO<Object> dao = new DAO<>(Object.class);
        
        dao.OpenTransction().include(c1).CloseTransction().closeDAO();
        
    }
}
