class Main {
  public static void main(String[] args) {
    Animal anim = new Animal("Arthur", 3); anim.printAnimalInfo();
    Reptile roger = new Reptile("Roger", 10, 4);
roger.printAnimalInfo();

    Dog doug = new Dog("Doug", "Labrador", 5);
doug.printAnimalInfo();
  }
}