class Main {
  public static void main(String[] args) {
    WaterBottle bottleOne = new WaterBottle();
    
    bottleOne.check();
    bottleOne.drink();
    bottleOne.check();

    WaterBottle bottle2 = new WaterBottle();

    bottle2.drink();
    bottle2.drink();
    bottle2.check();
  }
}