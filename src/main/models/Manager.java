package main.models;

public class Manager extends Staff{
    int managerId;

    public Manager(String firstName, String lastName, String emailAddress, String phoneNumber, int staffId, int managerId, String workEmail, String department) {
        super(firstName, lastName, emailAddress, phoneNumber, staffId, workEmail, department);
        this.managerId = managerId;
    }
    public int getManagerId(){
        return managerId;
    }
    public void setManagerId(int managerId){
        this.managerId = managerId;
    }
}
