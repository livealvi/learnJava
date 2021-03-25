public class MainEmployee {

    public static void main(String[] agrs){

        EmpSalary empSalary = new EmpSalary(50000.0 , 5000.0, 15000.0);
        //empSalary.setBasicAmout(60000.0);
        //empSalary.setFestivalBonus(7000.0);
        //empSalary.setOvertimeAmount(15500.0);

        Employee emp = new Employee("Alvi" , "18-36710-1", "alvi@gmail.com", "0177714467", empSalary );
        //emp.setPhoneNo("019514478");
        emp.show();
    }
}
