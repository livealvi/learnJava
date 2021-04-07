package vehicles;

import classes.Vehicle;

public class Bike extends  Vehicle{
    public String brandName;

    public Bike(){

    }

    public Bike(String name, int plateNumber, int wheelNumber,String brandName){
        super(name, plateNumber, wheelNumber);
        this.name = name;
        this.plateNumber = plateNumber;
        this.wheelNumber = wheelNumber;
        this.brandName = brandName;
    }

    public void start(){
        super.start();
        System.out.print(this.brandName + " Can Go.\n");
        System.out.print("=============================================\n");
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
        System.out.println("\n================ Bike Info's =================");
        super.show();
        System.out.println( name +" Brand Name: " + brandName +"\n");
        breakv();
        stop();
        start();
    }
}
