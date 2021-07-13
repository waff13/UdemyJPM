package CE045_Banking;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank (String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public Branch findBranch (String name) {
        // Return the branch if it exists or null otherwise
        for (int i = 0; i < branches.size(); i++) {
            Branch beingChecked = this.branches.get(i);
            if (beingChecked.getName().equals(name)) {
                return beingChecked;
            }
        }
        return null;
    }

    public boolean addBranch (String name) {
        // Return true if the branch was added or false otherwise
        Branch existingBranch = findBranch(name);
        if (existingBranch == null) {
            this.branches.add(new Branch(name));
        }
        return false;
    }

    public boolean addCustomer (String branchName, String customerName, double transaction) {
        // Return true if customer was added or false otherwise
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            return existingBranch.newCustomer(customerName, transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction (String branchName, String customerName, double transaction) {
        // Return true if customer transaction was added or false otherwise
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            return existingBranch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean listCustomers(String name, boolean printTransactions) {
        // Return true if the branch exists or false otherwise
        Branch existingBranch = findBranch(name);
        if (existingBranch != null) {
            System.out.println("Customer details for branch " + existingBranch.getName());

            ArrayList<Customer> branchCustomers = existingBranch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (printTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
