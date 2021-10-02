/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.manyToMany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author tiago
 */
@Entity
public class Comercio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private String addrees;

    private Integer cnpj;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "comercio_produto",
            joinColumns = @JoinColumn(name = "comercio_id",
                    referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id",
                    referencedColumnName = "id")
    )
    private List<Produto> produtos;

    public void Adicionar(Produto produto) {
        if (produto != null && !getProdutos().contains(produto)) {
            getProdutos().add(produto);
            if (produto.getComercio().contains(this)) {
                produto.getComercio().add(this);
            }
        }
    }

    public Comercio(String name, String addrees, Integer cnpj) {
        this.name = name;
        this.addrees = addrees;
        this.cnpj = cnpj;
    }

    public void AdicionarComercio() {

    }

    public List<Produto> getProdutos() {
        if (produtos == null) {
            produtos = new ArrayList<>();
        }
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddrees() {
        return addrees;
    }

    public void setAddrees(String addrees) {
        this.addrees = addrees;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

}
