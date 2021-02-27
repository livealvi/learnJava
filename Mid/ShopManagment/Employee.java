import java.util.Scanner;
public class Employee {
    public String[] empName = new String[2];
    public String empPhone;
    public String empEmail;
    private String empBloodGroup;
    private String[] empAddress = new String[2];

    public String[] Chips = new String[3];
    public String[] Fish = new String[3];
    public String[] Meat = new String[3];
    public String[] Veggies = new String[3];
    public String[] Milk = new String[3];
    public String[] Dirnks = new String[3];
    public Integer Option;
    public Integer Walet;

    Scanner input = new Scanner(System.in);

    Employee() {
        System.out.println("\n=========== Customer Info ===========\n");
    }

    public Employee(String empAddressPre, String empAddressPrema) {
        this.empAddress[0] = empAddressPre;
        this.empAddress[1] = empAddressPrema;
    }

    public void setEmpInfo(String empFname, String empLname, String empBloodGroup, String empPhone, String empEmail){
        this.empName[0] = empFname;
        this.empName[1] = empLname;
        this.empBloodGroup = empBloodGroup;
        this.empPhone = empPhone;
        this.empEmail = empEmail;
    }


    public void setCash(Integer cash){
        this.Walet = cash;
    }

    public void setChips(String chips1, String chips2, String chips3){
        this.Chips[0] = chips1;
        this.Chips[1] = chips2;
        this.Chips[2] = chips3;
    }

    public void setFish(String fish1, String fish2, String fish3){
        this.Fish[0] = fish1;
        this.Fish[1] = fish2;
        this.Fish[2] = fish3;

    }

    public void setMeat(String meat1, String meat2, String meat3){
        this.Meat[0] = meat1;
        this.Meat[1] = meat2;
        this.Meat[2] = meat3;
    }

    public void setVeggies(String veggies1, String veggies2, String veggies3){
        this.Veggies[0] = veggies1;
        this.Veggies[1] = veggies2;
        this.Veggies[2] = veggies3;
    }

    public void setMilk(String milk1, String milk2, String milk3){
        this.Milk[0] = milk1;
        this.Milk[1] = milk2;
        this.Milk[2] = milk3;
    }

    public void setDrinks(String drinks1, String drinks2, String drinks3){
        this.Dirnks[0] = drinks1;
        this.Dirnks[1] = drinks2;
        this.Dirnks[2] = drinks3;

    }

    public void menu(Integer option){
        this.Option = option;
    }

    public void ChooseMenu(){
        if (Option == 1){
            System.out.println("Your Select Chips Item." );
            checkingChipsItemPrice();
        } else if(Option == 2) {
            System.out.println("Your Select Fish Item." );
            checkingFishItemPrice();
        }else if(Option == 3) {
            System.out.println("Your Select Veggies Item." );
            checkingVeggiesItemPrice();
        }else if(Option == 4) {
            System.out.println("Your Select Meat Item." );
            checkingMeatIemPrice();
        }else if(Option == 5) {
            checkingMilkIemPrice();
            System.out.println("Your Select Milk Item." );
        }else if(Option == 6) {
            System.out.println("Your Select Drink Item." );
            checkingDirnksItemPrice();
        } else {
            System.out.println("You Press" + Option + " is Wrong Number!");
        }
    }

     public void checkingChipsItemPrice() {
        System.out.println("\nThere is 3 Item Available:\n1 - Lays, 2 - SUN, 3 - Alooz\n");
        System.out.print("Now Select a key: ");
        int Key = input.nextInt();
        if (Chips[0].equals("Lays") || (1 == Key) && this.Walet >= 50 ) {
            System.out.println("\nChips Name: Lays" + " And Price is: 50 BDT, Per PACK\n\nYour walte have: " + (this.Walet  - 50) + " BDT\n");
        } else if (Chips[1].equals("SUN") || (2 == Key) && this.Walet >= 30 ) {
            System.out.println("\nChips Name: Potato" + " And Price is: 30 BDT, Per PACK\n\nYour walte have: " + (this.Walet  - 30) + " BDT\n");
        } else if (Chips[2].equals("Alooz") || (3 == Key) && this.Walet >= 35 ) {
            System.out.println("\nChips Name: Alooz" + " And Price is: 200 BDT, Per PACK\n\nYour walte have: " + (this.Walet  - 35) + " BDT\n");
        } else {
            System.out.println("Insufficient Cash - You Can't Buy Chips!\n");
        }
    }

    public void checkingFishItemPrice() {
        System.out.println("\nThere is 3 Item Available:\n1 - Rui, 2 - Ilish, 3 - Katal\n");
        System.out.print("Now Select a key: ");
        int Key = input.nextInt();
        if (Fish[0].equals("Rui") || (1 == Key)) {
            System.out.println("Fish Name: Rui" + " And Price is: 500 BDT, Per KG\n\nYour walte have: " + (this.Walet  - 500) + " BDT\n");
        } else if (Fish[1].equals("Ilish") ||(2 == Key)) {
            System.out.println("Fish Name: Ilish" + " And Price is: 1000 BDT, Per KG\n\nYour walte have: "+ (this.Walet  - 1000) + " BDT\n");
        } else if (Fish[2].equals("Katal") || (3 == Key)) {
            System.out.println("Fish Name: Katal" + " And Price is: 1500 BDT, Per KG\n\nYour walte have: " + (this.Walet  - 1500) + " BDT\n");
        } else {
            System.out.println("Insufficient Cash - You Can't Buy Fish!\n");
        }
    }

    public void checkingVeggiesItemPrice() {
        System.out.println("\nThere is 3 Item Available:\n1 - Carrot, 2 - Tomato, 3 - Chili\n");
        System.out.print("Now Select a key: ");
        int Key = input.nextInt();
        if ((Veggies[0].equals("Carrot")) || (1 == Key)) {
            System.out.println("Veggies Name: Carrot" + " And Price is: 150 BDT, Per KG\n\nYour walte have: " + (this.Walet - 150) + " BDT\n");
        } else if (Veggies[1].equals("Tomato") || (2 == Key)) {
            System.out.println("Veggies Name: Tomato" + " And Price is: 80 BDT, Per KG\n\nYour walte have: " + (this.Walet - 80) + " BDT\n");
        } else if (Veggies[2].equals("Chili") || (3 == Key)) {
            System.out.println("Veggies Name: Chili" +" And Price is: 100 BDT, Per KG\n\nYour walte have: " + (this.Walet - 100) + " BDT\n");
        } else {
            System.out.println("Insufficient Cash - You Can't Buy Veggies!\n");
        }
    }

    public void checkingMeatIemPrice() {
        System.out.println("\nThere is 3 Item Available:\n1 - Mutton, 2 - Beef, 3 - Chicken\n");
        System.out.print("Now Select a key: ");
        int Key = input.nextInt();
        if (Meat[0].equals("Mutton") || (1 == Key)) {
            System.out.println("Meat Name: Mutton" + " And Price is: 200 BDT, Per KG\n\nYour walte have: " + (this.Walet - 900) + " BDT\n");
        } else if (Meat[1].equals("Beef") || (2 == Key)) {
            System.out.println("Meat Name: Beef" + " And Price is: 200 BDT, Per KG\n\nYour walte have: " + (this.Walet - 650) + " BDT\n");
        } else if (Meat[2].equals("Chicken") || (3 == Key)) {
            System.out.println("Meat Name: Chicken"  + " And Price is: 200 BDT, Per KG\n\nYour walte have: " + (this.Walet - 350) + " BDT\n");
        } else {
            System.out.println("Insufficient Cash - You Can't Buy Meat!");
        }
    }

    public void checkingDirnksItemPrice() {
        System.out.println("\nThere is 3 Item Available:\n1 - CocaCola, 2 - 7Up, 3 - Sprite\n");
        System.out.print("Now Select a key: ");
        int Key = input.nextInt();
        if (Dirnks[0].equals("CocaCola") || (1 == Key)) {
            System.out.println("Dirnks Name: CocaCola" + " And Price is: 200 BDT, Per Liter\n\nYour walte have: " + (this.Walet - 65) + " BDT\n");
        } else if (Dirnks[1].equals("7Up") || (2 == Key)) {
            System.out.println("Dirnks Name: 7Up" + " And Price is: 200 BDT, Per Liter\n\nYour walte have: " + (this.Walet - 65) + " BDT\n");
        } else if (Dirnks[2].equals("Sprite") || (3 == Key)) {
            System.out.println("Dirnks Name: Sprite" + " And Price is: 200 BDT, Per Liter\n\nYour walte have: " + (this.Walet - 65) + " BDT\n");
        } else {
            System.out.println("Insufficient Cash - You Can't Buy Drinks!");
        }
    }

    public void checkingMilkIemPrice() {
        System.out.println("\nThere is 3 Item Available:\n1 - Danno, 2 - Eldo, 3 - Fresh\n");
        System.out.print("Now Select a key: ");
        int Key = input.nextInt();
        if (Milk[0].equals("Danno") || (1 == Key)) {
            System.out.println( "Milk Name: " + "Danno" + " And Price is: 200 BDT, Per Liter\n\nYour walte have: " + (this.Walet - 200) + " BDT\n");
        } else if (Milk[1].equals("Eldo") || (2 == Key)) {
            System.out.println("Milk Name: " + "Eldo" + " And Price is: 200 BDT, Per Liter\n\nYour walte have: " + (this.Walet - 600) + " BDT\n");
        } else if (Milk[2].equals("Fresh") || (3 == Key)) {
            System.out.println("Milk Name: " + "Fresh" + " And Price is: 200 BDT, Per Liter\n\nYour walte have: " + (this.Walet - 350) + " BDT\n");
        } else {
            System.out.println("Insufficient Cash - You Can't Buy Milk!");
        }
    }

    public void checkingEmpAdd() {
        if (empAddress[1].equals("Dhaka")) {
            System.out.println("Customer Permanente Address: " + empAddress[1]  + " And This Customer form " + empAddress[1] + " Division");
        } else if (empAddress[1].equals("Chattogram")) {
            System.out.println("Customer Permanente Address: " + empAddress[1] + " And This Customer form " + empAddress[1] + " Division");
        } else if (empAddress[1].equals("Khulna")) {
            System.out.println("Customer Permanente Address: " + empAddress[1] + " And This Customer form " + empAddress[1] + " Division");
        } else if (empAddress[1].equals("Barisal")) {
            System.out.println("Customer Permanente Address: " + empAddress[1] + " And This Customer form " + empAddress[1] + " Division");
        } else if (empAddress[1].equals("sylhet")) {
            System.out.println("Customer Permanente Address: " + empAddress[1] + " And This Customer form " + empAddress[1] + " Division");
        } else if (empAddress[1].equals("Rangpur")) {
            System.out.println("Customer Permanente Address: " + empAddress[1] + " And This Customer form " + empAddress[1] + " Division");
        } else if (empAddress[1].equals("Mymensingh")) {
            System.out.println("Customer Permanente Address: " + empAddress[1] + " And This Customer form " + empAddress[1] + " Division");
        } else if (empAddress[1].equals("Rajshahi")) {
            System.out.println("Customer Permanente Address: " + empAddress[1] + " And This Customer form " + empAddress[1] + " Division");
        } else {
            System.out.println("There is No Customer On This Division\n");
        }
    }

    public void showEmpInformation() {
        System.out.println("Name: " + this.empName[0] + " " + empName[1]);
        System.out.println("Phone: " + this.empPhone);
        System.out.println("Blood Group: " + this.empBloodGroup);
        System.out.println("Email: " + this.empEmail);
        System.out.println("Present Address : " + this.empAddress[0]);
        System.out.println("Permanent Address : " + this.empAddress[1]);
    }

}
