/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.basicoProduct;

import infra.DAO;
import java.util.Comparator;
import java.util.List;
import modelo.basico.Product;

/**
 *
 * @author tiago
 */
public class getAll {
    public static void main(String[] args) {
        DAO<Product> infraDao = new DAO<>(Product.class);
        
        List<Product> prod = infraDao.getAll(8, 0);
        
        for (Product product : prod) {
            System.out.println("\nProduto => "+product.getNome()+"\nCategoria: "+product.getTp());
        }
        double precoTotal = prod
                .stream()
                .map(p -> p.getPreco())
                .reduce(0.0, (one, two) -> one + two)
                .doubleValue();
        System.out.println("O valor total é: "+precoTotal);
        
        Comparator<Product> melhorPreco = (preco1, preco2) -> {
            if (preco1.getPreco() > preco2.getPreco()) {
                return 1;
            }
            if (preco1.getPreco() < preco2.getPreco()) {
                return -1;
            }
            return 0;
        };
        System.out.println("Melhor preço "+prod
                .stream()
                .max(melhorPreco) 
                .get());
    }
}
