public class Rectangle extends Shape {

    public Rectangle(){

    }

    public Rectangle (double height, double width){
        super(height,width);
    }

    public void calculateArea(){
        System.out.println("==== This is Rectangle ====");
        System.out.println("Rectangle of height: " + this.height );
        System.out.println("Rectangle of width: " + this.width);
        System.out.println("===========================\n");
    }

}
