
public class Student {
    public String name;
    public String id;
    private float cgpa;

    public Student(String name, String id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public void canAttendClass() {
        System.out.println("Can Attend Class");
    }

    public float getCgpa() {
        return this.cgpa;
    }

    public void show() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Cgpa: " + this.cgpa);
    }
}