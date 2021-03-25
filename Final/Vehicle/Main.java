public class Main {
    public static void main(String[] args) {

        System.out.println("\n================ Default Value =================");
        Vehicle vehicle = new Vehicle("No Name Vehicle", 111111, 222222);
        vehicle.show();

        vehicle = new Bike("Bike", 229910, 105678, "Yamaha R6");
        vehicle.show();

        vehicle = new Car("Car", 12499845, 99377653, "Porsche 911", 23939);
        vehicle.show();

    }
}
