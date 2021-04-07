package classes;

public class Vehicle {
    public String name;
    public int plateNumber;
    public int wheelNumber;

    public Vehicle(){

    }

    public Vehicle(String name, int plateNumber, int wheelNumber){
        this.name = name;
        this.plateNumber = plateNumber;
        this.wheelNumber = wheelNumber;
    }

    public void start(){
        System.out.print("Traffic Light is Green. Now, ");
    }

    public void breakv(){
        System.out.print("Traffic Light is Yellow. Please, Break Your ");
    }

    public void stop(){
        System.out.print("Traffic Light is Red. Please, Stop Your ");
    }

    public void show() {
        System.out.println("");
        System.out.println("The Vehicle Type: " + this.name);
        System.out.println("The Plate Number of Vehicle: " + this.plateNumber);
        System.out.println("The Wheel Number of Vehicle: " + this.wheelNumber);
    }
}
