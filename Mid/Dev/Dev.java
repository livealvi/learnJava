public class Dev {
    public static void main(String agr[]) {

        String firstName = "\t    Alvi";
        String lastName = "Hasan\n";
        String id = "\t    18-36710-1\n";
        String university= "American International University-Bangladesh\n";
        String email = "\t    hello@alvihasan.com\n";

        AboutMe alvi = new AboutMe(firstName, lastName, id, university, email);
        alvi.show();
        alvi.showMySkills();
        alvi.showMyBio();
    }
}
