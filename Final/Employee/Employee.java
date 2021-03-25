public class Employee {
    public String Name;
    public String ID;
    private EmpSalary empSalary;
    private String phoneNo;
    public String email;

    public Employee(){

    }

    public Employee(String name, String id, String email,String phoneNo, EmpSalary empSalary){
        this.Name = name;
        this.ID = id;
        this.email = email;
        this.phoneNo = phoneNo;
        this.empSalary = empSalary;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void show(){
        System.out.println("Employee Name: " + this.Name);
        System.out.println("Employee ID: " + this.ID);
        System.out.println("===============\n");
        System.out.println("Employee Salary's Breakdown - " + "\nBasic Amount: " + empSalary.getBasicAmout() + "\nFestival Bonus: " + empSalary.getFestivalBonus() + "\nOvertime Amount: " + empSalary.getOvertimeAmount());
        System.out.println("\n===============");
        System.out.println("Employee Phone: " + this.phoneNo);
        System.out.println("Employee Email: " + this.email);
    }

}
