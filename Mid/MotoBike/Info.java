public class Info 
{
    public String bikeName;
    public String bikeModel;
    public String bikeCC;
    public float bikePrice;

    public Info(String bikeName, String bikeModel, String bikeCC, float bikePrice) 
    {
        this.bikeName = bikeName;
        this.bikeModel = bikeModel;
        this.bikeCC = bikeCC;
        this.bikePrice = bikePrice;
    }

    public void Showroom() 
    {
        System.out.println("Showroom: House 03, Road - 02, Gulshan, Dhaka.");
    }

    public void bikeDetails() 
    {
        System.out.println("Bike Brand: " + this.bikeName);
        System.out.println("Bike Model: " + this.bikeModel);
        System.out.println("Bike CC: " + this.bikeCC);
        System.out.println("Bike Price: " + this.bikePrice + " Lakh");
    }

}