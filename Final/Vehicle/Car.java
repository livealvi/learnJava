public class Car extends Vehicle {
    public String brandName;
    public int seatNumber;

    public Car(){

    }

    public Car(String name, int plateNumber, int wheelNumber,String brandName, int seatNumber){
        super(name, plateNumber, wheelNumber);
        this.name = name;
        this.plateNumber = plateNumber;
        this.wheelNumber = wheelNumber;
        this.brandName = brandName;
        this.seatNumber = seatNumber;
    }

    public void start(){
        super.start();
        System.out.print(this.brandName + " Can Go.\n");
        System.out.print("=============================================");
    }

    public void breakv(){
        super.breakv();
        System.out.print(this.brandName + ".\n");
    }

    public void stop(){
        super.stop();
        System.out.print(this.brandName + ".\n");

    }

    public void show() {
        System.out.println("\n================ Car Info's =================");
        super.show();
        System.out.println( name +" Brand Name: " + brandName);
        System.out.println( name +" Seat Name: " + seatNumber +"\n");
        breakv();
        stop();
        start();
    }

}
