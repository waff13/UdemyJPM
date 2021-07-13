package CE045_Banking;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch (String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer (String name) {
        // Returns Customer if it exists or null if it does not
        for (int i = 0; i < customers.size(); i++) {
            Customer beingChecked = this.customers.get(i);
            if (beingChecked.getName().equals(name)) {
                return beingChecked;
            }
        }
        return null;
    }

    public boolean newCustomer (String name, double initialAmount) {
        // Returns true if customer was added or false if it did not
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer == null) {
            return customers.add(new Customer(name, initialAmount));
        }
        return false;
    }
    
    public boolean addCustomerTransaction (String name, double amount) {
        // Returns true if transaction was added or false if it did not
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
}
