package org.example.ic_composant.service;

import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.example.ic_composant.entities.Customer;

import java.util.List;

@RequestScoped
public class CustomerManager {

    @PersistenceContext
    private EntityManager em;

    public List<Customer> getAllCustomers() {
        // Utilisation de JPQL pour récupérer tous les clients
        String jpql = "SELECT c FROM Customer c";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    };

    @Transactional
    public void persist(Customer customer) {
        em.persist(customer);
    }

    @Transactional
    public Customer update(Customer customer) {
        return null;
    }

    @Transactional
    public void delete(Customer customer) {
        em.remove(em.contains(customer) ? customer : em.merge(customer));
    }

    public Customer getCustomerById(Long id) {
        return em.find(Customer.class, id);
    }
}

