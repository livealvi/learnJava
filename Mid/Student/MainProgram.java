public class MainProgram {
    public static void main(String agr[]) {

        String name = "Alvi";
        String id = "18-36710-1";
        float cgpa = 3.0f;

        Student student = new Student(name, id, cgpa);
        student.canAttendClass();
        student.show();
    }
}
