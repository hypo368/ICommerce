import org.example.ic_composant.entities.Customer;
import org.example.ic_composant.service.CustomerManager;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        // Création d'un client
        Customer customer = new Customer("DISCOUNT_CODE", "ZIP", "NAME", "ADDRESSLINE1", "ADDRESSLINE2", "CITY", "STATE", "PHONE", "FAX", "EMAIL", 1000);
        customerManager.persist(customer);

        // Lecture d'un client par son identifiant
        Customer customerRead = customerManager.getCustomerById(1L);
        System.out.println("Customer name: " + customerRead);


        // mise a jour du client
        customerRead.setNAME("Robert");
        customerManager.update(customerRead);

        // suppression du client
        customerManager.delete(customerRead);

    }
}
