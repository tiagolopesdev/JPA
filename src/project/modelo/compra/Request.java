/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.modelo.compra;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author tiago
 */
@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    @OneToMany(mappedBy = "request")
    private List<ItensRequest> itensRequests;

    public Request() {
    }

    public Request(Date date) {
        super();
        this.date = date;
    }

    public List<ItensRequest> getItensRequests() {
        return itensRequests;
    }

    public void setItensRequests(List<ItensRequest> itensRequests) {
        this.itensRequests = itensRequests;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
