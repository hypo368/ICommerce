package org.example.ic_composant.service;

import org.example.ic_composant.entities.Discount;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;


@RequestScoped
public class DiscountManager {

    @PersistenceContext(unitName = "my-persistence-unit")
    private EntityManager em;

    public List<Discount> getAllDiscounts() {
        return em.createNamedQuery("Discount.findAll", Discount.class).getResultList();
    }

    public Discount findById(String code) {
        return em.find(Discount.class, code);
    }

    @Transactional
    public void persist(Discount discount) {
        em.persist(discount);
    }
}