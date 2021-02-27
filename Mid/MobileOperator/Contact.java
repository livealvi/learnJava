
public class Contact {
    public String name;
    public String countryCode;
    public String bloodGroup;
    public String email;
    private String phoneNumber;
    private String address;

    Contact() {
        System.out.println("Operator Result\n");
    }

    public Contact(String phoneNumber, String address) {
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void setter(String name, String countryCode, String bloodGroup, String email) {
        this.name = name;
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
        System.out.println("Name: " + this.name);
        System.out.println("Country Code: " + this.countryCode);
        System.out.println("Blood Group: " + this.bloodGroup);
        System.out.println("Blood Email: " + this.email);
        System.out.println("Address: " + this.address);
    }
}