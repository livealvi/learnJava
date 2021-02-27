import java.util.Scanner;

public class VCP_Checker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        VowelConsonantPrimeCheck VCP_check = new VowelConsonantPrimeCheck();

        System.out.print("\nVowel Consonant Checker\n");
        System.out.print("Please Enter String: ");
        String inputVC = input.nextLine();
        VCP_check.vowelConsonant(inputVC);

        System.out.println("\n=======================================\n");

        System.out.print("Prime Number Checker\n");
        System.out.print("Please input Positive Number: ");
        Integer inputPN = input.nextInt();
        VCP_check.primeNumberChecker(inputPN);
    }
}
