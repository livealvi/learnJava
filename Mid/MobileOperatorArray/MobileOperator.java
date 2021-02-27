import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n==== Please Enter the Operator ====\n");

        String[] Name = new String[2];

        System.out.println("Name:- 1 for First Name || 2 for Last Name");
        for(int i = 0; i < Name.length; i++)
        {
            System.out.print("Please Enter Name "+(i + 1)+ ": ");
            Name[i] = input.nextLine();
        }

        String[] Address = new String[2];
        System.out.println("\nAddress:- 1 for Present Address || 2 for Permanent Address");
        for(int i = 0; i < Address.length; i++)
        {
            System.out.print("Please Enter Address "+(i + 1)+": ");
            Address[i] = input.nextLine();
        }

        System.out.print("\nEnter the Country Code: ");
        String countryCode = input.nextLine();

        System.out.print("Enter the Blood Group: ");
        String bloodGroup = input.nextLine();

        System.out.print("Enter the Email: ");
        String email = input.nextLine();

        System.out.print("Enter the Phone Number: ");
        String phoneNumber = input.nextLine();

        System.out.println("\n=======================================\n");

        Contact ConCall = new Contact();

        Contact person = new Contact(phoneNumber, Address[0], Address[1]);

        person.setter(Name[0], Name[1], countryCode, bloodGroup, email);
        person.showInformation();
        person.checkingOperator();

        System.out.println("\n=======================================\n");

        String[] arrayAssing = new String[4];
        System.out.println("Assign:- 1 for Name || 2 for ID || 3 for CGPA || 4 for Course");

        for(int i = 0; i < arrayAssing.length; i++)
        {
            System.out.print("Please Enter for Assign "+(i + 1)+ ": ");
            arrayAssing[i] = input.nextLine();
        }
        person.assign(arrayAssing[0],arrayAssing[1],arrayAssing[2],arrayAssing[3]);
        System.out.println("\n====== Array Assign ======");
        person.print();
        System.out.println("==========================");

        String[] arrayRemove = new String[4];
        System.out.println("\nRemove:- 1 for Name || 2 for ID || 3 for CGPA || 4 for Course");
        for(int i = 0; i < arrayRemove.length; i++)
        {
            System.out.print("Remove & Replace "+(i + 1)+ ": ");
            arrayRemove[i] = input.nextLine();
        }
        person.remove(arrayRemove[0], arrayRemove[1], arrayRemove[2], arrayRemove[3]);
        System.out.println("\n====== New Remove & Replce ======");
        person.print();
        System.out.println("==================================");
    }
}
