import java.util.Scanner;

class MainProgram {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3];

        System.out.print("Enter the Array: ");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print("arr [" + i + "] [" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }

            System.out.print("arr [" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Array elements are: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("arr [" + i + "][" + j + "] : " +arr[i][j]);
        }

    }
}