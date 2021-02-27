import java.util.Scanner;

public class ShopManagment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n==== Welcome To Shop Management System ====\n");
        Employee product = new Employee();
        System.out.println("Before Buy any Item How Much Money Do You Have?" );
        System.out.print("Enter Amount: ");
        Integer cash = input.nextInt();
        product.setCash(cash);

        product.setMilk("", "", "");
        product.setChips("", "", "");
        product.setDrinks("", "", "");
        product.setFish("", "", "");
        product.setMeat("", "", "");

        System.out.println("\nWhich Item you want to buy:\n1 - Chips, 2 - Fish, 3 - Veggiess, 4 - Meat, 5 - Milk, 6 - Drinks\n");
        System.out.print("Enter the Item Number: ");
        Integer select = input.nextInt();
        product.menu(select);
        product.ChooseMenu();

        System.out.println("==== Please Enter Customer Info - Invoice ====\n");

        String[] Name = new String[2];

        System.out.println("Name:- 1 for First Name || 2 for Last Name");
        for(int i = 0; i < Name.length; i++)
        {
            System.out.print("\nPlease Enter Name "+(i + 1)+ ": ");
            Name[i] = input.nextLine();
        }

        System.out.print("Enter the Phone Number: ");
        String phoneNumber = input.nextLine();

        System.out.print("Enter the Blood Group: ");
        String bloodGroup = input.nextLine();

        System.out.print("Enter the Email: ");
        String email = input.nextLine();

        String[] Address = new String[2];
        System.out.println("\nAddress:- 1 for Present Address || 2 for Permanent Address (Division Only)");
        for(int i = 0; i < Address.length; i++)
        {
            System.out.print("Please Enter Address "+(i + 1)+": ");
            Address[i] = input.nextLine();
        }

        Employee emp = new Employee( Address[0], Address[1]);
        emp.setEmpInfo(Name[0], Name[1], bloodGroup, phoneNumber, email);

        System.out.println("\n=========== About Customer ===========\n");

        emp.showEmpInformation();
        emp.checkingEmpAdd();

    }

}
