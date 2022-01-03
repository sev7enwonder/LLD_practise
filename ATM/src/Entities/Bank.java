package Entities;

public class Bank {
    private String name;
    private Address branchLocation;
    private String bankId;

    public Bank(String name, Address branchLocation, String bankId) {
        this.name = name;
        this.branchLocation = branchLocation;
        this.bankId = bankId;
    }

    public String getName() {
        return name;
    }

    public Address getBranchLocation() {
        return branchLocation;
    }

    public String getBankId() {
        return bankId;
    }
}
