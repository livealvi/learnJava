public class  Triangle extends Shape {
    public double base;
    public Triangle(){

    }

    public Triangle(double height, double width, double base){
        super(height,width);
        this.base = base;
    }
    public void calculateArea(){
        System.out.println("==== This is Triangle ====");
        System.out.println("Triangle of height: " + this.height );
        System.out.println("Triangle of width: " + this.width);
        System.out.println("Triangle of base: " + this.base);
        System.out.println("===========================\n");
    }
}
