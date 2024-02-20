package org.example.ic_composant.service;

import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.ic_composant.entities.Customer;

import java.util.List;

@RequestScoped
public class CustomerManager {

    @PersistenceContext(unitName = "my-persistence-unit")
    private EntityManager em;

    public List<Customer> getAllCustomers() {
        return em.createNamedQuery("Customer.findAll", Customer.class).getResultList();
    }

    @Transactional
    public Customer update(Customer customer) {
        return em.merge(customer);
    }

    @Transactional
    public void persist(Customer customer) {
        em.persist(customer);
    }
}

