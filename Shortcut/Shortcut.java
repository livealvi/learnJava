
import java.util.Scanner;
public class Shortcut {

    public static void main(String[] args) {

        //Scanner - Input
        Scanner input = new Scanner(System.in);

        //Type: String - Name 
        String[] Name = new String[2];
        System.out.println("Name:- 1 for First Name || 2 for Last Name");
        for(int i = 0; i < Name.length; i++)
        {
            System.out.print("\nPlease Enter Name " + (i + 1) + ": ");
            Name[i] = input.nextLine();
        }

        

        System.out.println(Name[0], Name[2]);

    }
    
}