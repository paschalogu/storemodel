package main.models;

public class Staff extends User{
    private int staffId;
    private String workEmail;

    private String department;

    public Staff(String firstName, String lastName, String emailAddress, String phoneNumber, int staffId, String workEmail, String department) {
        super(firstName, lastName, emailAddress, phoneNumber);
        this.staffId = staffId;
        this.workEmail = workEmail;
        this.department = department;
    }

    public int getStaffId(){
        return staffId;
    }

    public void setStaffId(int staffId){
        this.staffId = staffId;
    }

    public String getWorkEmail(){
        return workEmail;
    }
    public void setWorkEmail(String workEmail){
        this.workEmail = workEmail;
    }

    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }

}
