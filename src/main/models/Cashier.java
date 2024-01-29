package main.models;

public class Cashier extends Staff{
    String officeStand;
    public Cashier(String firstName, String lastName, String emailAddress, String phoneNumber, int staffId, String workEmail, String department, String officeStand) {
        super(firstName, lastName, emailAddress, phoneNumber, staffId, workEmail, department);
        this.officeStand = officeStand;
    }
    public String getOfficeStand(){
        return officeStand;
    }

    public void setOfficeStand(String officeStand){
        this.officeStand = officeStand;
    }
}
