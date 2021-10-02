/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.basicoProduct;

import infra.DAO;
import java.util.Arrays;
import java.util.List;
import modelo.basico.Product;
import modelo.basico.TypeProduct;

/**
 *
 * @author tiago
 */
public class NewProduct {
    public static void main(String[] args) {
        
        Product p1 = new Product("Carne", 14.45);
        Product p2 = new Product("Cuscuz", 2.65);
        Product p3 = new Product("Biscoito", 2.22);
        Product p4 = new Product("Sal", 4.00);
        Product p5 = new Product("Açucar", 3.55);
        Product p6 = new Product("Macarrão", 2.50);
        Product p7 = new Product("Feijão", 6.00);
        Product p8 = new Product("Arroz", 15.50);
        Product p9 = new Product("Sabão de barra", 5.50);
        Product p10 = new Product("Condicionador", 6.80);
        Product p11 = new Product("Escova de dente", 4.30);
        Product p12 = new Product("Pasta de dente", 5.20);
        
        List<Product> prod = Arrays.asList(p1, p2, p3, p4, 
                p5, p6, p7, p8, p9, p10, p11, p12);
        
        DAO<Product> infraDao = new DAO<>(Product.class);
        infraDao.OpenTransction();
        for(Product p : prod){
            infraDao.include(p);
        }
        infraDao.CloseTransction();
        
        //infraDao.OpenTransction().include(p1).CloseTransction();
        
        
    }
}
