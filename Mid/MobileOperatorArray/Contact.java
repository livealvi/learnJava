public class Contact {
    public String[] name = new String[2];
    public String countryCode;
    public String bloodGroup;
    public String email;
    private String phoneNumber;
    private String[] address = new String[2];

    public String [] arrayManipulation = new String[4];


    Contact() {
        System.out.println("=========== Operator Result ===========\n");
    }

    public Contact(String phoneNumber, String addressPre, String addressPrema) {
        this.phoneNumber = phoneNumber;
        this.address[0] = addressPre;
        this.address[1] = addressPrema;
    }

    public void setter(String firstName, String lastName, String countryCode, String bloodGroup, String email) {
        this.name[0] = firstName;
        this.name[1] = lastName;
        this.countryCode = countryCode;
        this.bloodGroup = bloodGroup;
        this.email = email;
    }

    public void checkingOperator() {
        if (phoneNumber.charAt(2) == '7') {
            System.out.println("Phone Number: " + phoneNumber + " - The number is GP Operator");
        } else if (phoneNumber.charAt(2) == '9') {
            System.out.println("Phone Number: " + phoneNumber + " - The number is Banglalink Operator");
        } else if (phoneNumber.charAt(2) == '8') {
            System.out.println("Phone Number: " + phoneNumber + " - The number is Robi Operator");
        } else if (phoneNumber.charAt(2) == '5') {
            System.out.println("Phone Number: " + phoneNumber + " - The number is Teletalk Operator");
        } else if (phoneNumber.charAt(2) == '6') {
            System.out.println("Phone Number: " + phoneNumber + " - The number is Airtel Operator");
        } else {
            System.out.println(phoneNumber + "There is No Operator Operator");
        }
    }

    public void showInformation() {
        System.out.println("Name: " + this.name[0] + " " + name[1]);
        System.out.println("Country Code: " + this.countryCode);
        System.out.println("Blood Group: " + this.bloodGroup);
        System.out.println("Blood Email: " + this.email);
        System.out.println("Present Address : " + this.address[0]);
        System.out.println("Permanent Address : " + this.address[1]);
    }


    //Assign Remove & Print
    public void assign(String myName, String number, String cgpa, String course){
        this.arrayManipulation[0] = myName;
        this.arrayManipulation[1] = number;
        this.arrayManipulation[2] = cgpa;
        this.arrayManipulation[3] =course;
    }

    public void remove(String myName, String id, String cgpa, String course){
        this.arrayManipulation[0] =myName;
        this.arrayManipulation[1] = id;
        this.arrayManipulation[2] = cgpa;
        this.arrayManipulation[3] =course;
   }

   public void print(){
        System.out.println("Name: "+ this.arrayManipulation[0] + "\nID: "+ this.arrayManipulation[1] +"\nCGPA: "+ this.arrayManipulation[2] + "\nCourse: "+ this.arrayManipulation[3]);
    }

}