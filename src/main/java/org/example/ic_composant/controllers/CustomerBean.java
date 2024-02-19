package org.example.ic_composant.controllers;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import org.example.ic_composant.entities.Customer;
import org.example.ic_composant.service.CustomerManager;

import java.util.List;

@RequestScoped
public class CustomerBean {
    private Customer customer = new Customer();
    private List<Customer> customers;

    @EJB
    private CustomerManager customerManager;

    public void saveCustomer() {
        customerManager.createCustomer(customer);
        customer = new Customer();
    }

    public List<Customer> getCustomers() {
        return customerManager.getAllCustomers();
    }

    // Getters and setters

    public Customer getCustomer() {
        return customer;
    }

    public CustomerManager getCustomerManager() {
        return customerManager;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void setCustomerManager(CustomerManager customerManager) {
        this.customerManager = customerManager;
    }
}
