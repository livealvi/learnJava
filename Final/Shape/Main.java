public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape (300.0 ,400.0);
        shape.calculateArea();

        shape = new Rectangle(500.0, 600.0);
        shape.calculateArea();

        shape = new Triangle(789.0, 668.0, 900.0);
        shape.calculateArea();
    }
}
