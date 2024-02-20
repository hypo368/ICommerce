package org.example.ic_composant.controllers;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.example.ic_composant.entities.Customer;
import org.example.ic_composant.service.CustomerManager;

import java.io.Serializable;
import java.util.List;

@ViewScoped
@Named("customerBean")
public class CustomerBean implements Serializable {

    private List<Customer> customers;

    @Inject
    private CustomerManager customerManager;

    public CustomerBean() {
        // Default constructor
    }

    public List<Customer> getCustomers() {
        if (customers == null) {
            customers = customerManager.getAllCustomers();
        }
        return customers;
    }

}
