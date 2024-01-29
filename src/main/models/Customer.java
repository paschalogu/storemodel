package main.models;

public class Customer extends User{
    // Add a shopping cart in the future
    String customerId;
    int accountBalance;



    public Customer(String firstName, String lastName, String emailAddress, String phoneNumber, String customerId, int accountBalance) {
        super(firstName, lastName, emailAddress, phoneNumber);
        this.customerId = customerId;
        this.accountBalance = accountBalance;
    }

    public String getCustomerId(){
        return customerId;
    }
    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }
    public int getAccountBalance(){
        return accountBalance;
    }
    public void setAccountBalance(int accountBalance){
        this.accountBalance = accountBalance;
    }

}
