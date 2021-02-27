public class VowelConsonantPrimeCheck {
    public String vowelConsonant;
    public Integer primeNumber;

    public void vowelConsonant(String vcReceive) {
        this.vowelConsonant = vcReceive;
        if (vcReceive.charAt(0) == 'a' || vcReceive.charAt(0) == 'A') {
            System.out.println("1st char is: '" + vcReceive.charAt(0) + "'" + "\nSo, " + vcReceive + " is vowel");
        } else if (vcReceive.charAt(0) == 'e' || vcReceive.charAt(0) == 'E') {
            System.out.println("1st char is: '" + vcReceive.charAt(0) + "'" + "\nSo, " + vcReceive + " is vowel");
        } else if (vcReceive.charAt(0) == 'i' || vcReceive.charAt(0) == 'I') {
            System.out.println("1st char is: '" + vcReceive.charAt(0) + "'" + "\nSo, " + vcReceive + " is vowel");
        } else if (vcReceive.charAt(0) == 'o' || vcReceive.charAt(0) == 'O') {
            System.out.println("1st char is: '" + vcReceive.charAt(0) + "'" + "\nSo, " + vcReceive + " is vowel");
        } else if (vcReceive.charAt(0) == 'u' || vcReceive.charAt(0) == 'U') {
            System.out.println("1st char is: '" + vcReceive.charAt(0) + "'" + "\nSo, " + vcReceive + " is vowel");
        } else {
            System.out.println("1st char is: '" + vcReceive.charAt(0) + "'" + "\nSo, " + vcReceive + " is Consonant");
        }
    }

    public void primeNumberChecker(Integer primeNumber){
        this.primeNumber = primeNumber;
        int count = 0;
        for(int i =2; i<primeNumber; i++ ){
            if(primeNumber%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(primeNumber + " is Prime Number");
        }else{
            System.out.println(primeNumber + " is no Prime Number");
        }
    }
}