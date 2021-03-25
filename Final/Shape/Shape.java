public class Shape {
    public double height;
    public double width;

    public Shape(){

    }

    public Shape(double height, double width){
        this.height = height;
        this.width = width;
    }

    public void calculateArea(){
        System.out.println("\n==== This is Shape ====");
        System.out.println("Shape of height: " + this.height );
        System.out.println("Shape of width: " + this.width);
        System.out.println("========================\n");
    }

}
