public class Apartment {

  // instance variable
   int floorNumber;

  // constructor
   public Apartment(int floorNumber) {
     this.floorNumber = floorNumber;
   }

  // instance method
   public void useWater() {
    WaterTank.decreaseWaterLevel();
    WaterTank.printWaterLevel();
    
   }

  
    
}