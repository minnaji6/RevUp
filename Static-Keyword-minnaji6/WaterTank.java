class WaterTank {
  public static int waterLevel = 100;
  public static void printWaterLevel() {
  System.out.println("Water level: " + WaterTank.waterLevel); 
  }
  public static void decreaseWaterLevel() {
    if (waterLevel > 0){
      waterLevel -=10;
      System.out.println("Water gushes");
    }
    else {
      System.out.println ("No water!");
    }
      
  }
  

}