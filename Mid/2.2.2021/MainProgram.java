import java.util.Scanner;

class MainProgram
{
    public static void main(String arg[])
    {
        Student s[] = new Student[4];

        Student s1 = new Student("test", "1-1", 3.0f, "OOP1", "OOAD");
        //s1.showInformation();
        
         s[0] = s1;
         s[1] = new Student("test", "1-1", 3.0f, "OOP1", "OOAD");
         s[0].showInformation();
         s[1].showInformation(); 

        int temp = 0;
        for (int i = 0; i < 4; i++) {
            if (s[i] == null) {
                s[i] = s1;
                temp++;
                System.out.println("Obj has been assigned");
                break;
            }
        }
        if (temp == 0) {
            System.out.println("Allocation is not possible:" + temp);
        } else {
            System.out.println();
        }

    }
}