/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.onToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import modelo.basico.Product;

/**
 *
 * @author tiago
 */
@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private int quantidade;

    @Column(nullable = true)
    private Double preco;

    @ManyToOne
    private Pedido pedido;

    @ManyToOne
    private Product produto;

    public ItemPedido() {
    }

    public ItemPedido(int quantidade, Pedido pedido, Product produto) {
        this.setQuantidade(quantidade);
        this.setPedido(pedido);
        this.setProduto(produto);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Product getProduto() {
        return produto;
    }

    public void setProduto(Product produto) {
        this.produto = produto; 
        if (produto != null && this.preco == null) {
            this.setPreco(produto.getPreco());
        }
    }

}
