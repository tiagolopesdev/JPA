/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author tiago
 */
public class DAO<E> {

    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("exercicios_java");
        } catch (Exception e) {
            System.out.println("Não deu pra acessar, motivo: " + e.getMessage());
        }
    }

    public DAO(Class<E> classe) {
        this.classe = classe;
        try {
            em = emf.createEntityManager();
        } catch (Exception e) {
            System.out.println("erro aqui! " + e.getMessage());
        }
    }

    public DAO<E> OpenTransction() {
        try {
            em.getTransaction().begin();
        } catch (Exception e) {
            System.out.println("Ops! não deu para abrir a transação. " + e.getMessage());
        }
        return this;
    }

    public DAO<E> CloseTransction() {
        try {
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Ops! erro para fechar transação. "+e.getMessage());
        }
        return this;
    }

    public DAO<E> include(E entidade) {
        try {
            em.persist(entidade);
        } catch (Exception e) {
            System.out.println("Ops! não deu para incluir os dados. " + e.getMessage());
        }
        return this;
    }

    public DAO<E> Remove(E entidade, int primaryKey) {
        entidade = em.find(classe, primaryKey);
        em.remove(entidade);
        return this;
    }

    public E getOneId(Object id) {
        return em.find(classe, id);
    }

    public List<E> getAll(int qnt, int deslocamento) {
        if (classe == null) {
            throw new UnsupportedOperationException("Classe nula.");
        }
        String jpql = "select e from " + classe.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(qnt);
        query.setFirstResult(deslocamento);

        return query.getResultList();
    }

    public void closeDAO() {
        em.close();
    }

}
