/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.modelo.compra;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author tiago
 */
@Entity
@Table(name = "itenspedidos")
public class ItensRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = true)
    private Double preco;
    @Column(nullable = true)
    private Integer quantidade;
    @ManyToOne
    private Request request;
    @ManyToOne
    private ProductsProject productsProject;

    public ItensRequest() {
    }

    public ItensRequest(Integer quantidade, Request request, ProductsProject productsProject) {
        super();
        this.setQuantidade(quantidade);
        this.setRequest(request);
        this.setProductsProject(productsProject);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public ProductsProject getProductsProject() {
        return productsProject;
    }

    public void setProductsProject(ProductsProject productsProject) {
        this.productsProject = productsProject;
        if (productsProject != null && this.preco == null) {
            this.setPreco(productsProject.getPreco());
        }
    }

}
