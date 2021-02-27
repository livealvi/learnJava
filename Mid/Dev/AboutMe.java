public class AboutMe {
    public String fname;
    public String lname;
    public String id;
    public String university;
    public String email;
    

    public AboutMe(String fname, String lname, String id, String university, String email) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
        this.university = university;
        this.email = email;
    }

    public void showMySkills() {
        System.out.println("=======================================\n");
        System.out.println("\tMy Skills Are: C, C++, cPanel Managment, JavaScript: ES5, ES6, ES7, Photoshop, Illustrator, UI/UX.\n");
    }

    public void showMyBio() {
        System.out.println("========================================\n");
        System.out.println("\tI am Alvi Hasan. I am a Software Engineer. I always learn to like new technology.\n\tCoding is my enthusiasm and Maximum of the favorite programming language is C++ and JavaScript.\n\tThank You, Have a Great Day!");
    }
    
    public void show() {
        System.out.println("\n\n=============== About Me ===============\n");
        System.out.println("\tName: " + this.fname + " " + this.lname);
        System.out.println("\tID: " + this.id);
        System.out.println("\tUniversity: " + this.university);
        System.out.println("\tEmail: " + this.email);
    }
    
}

