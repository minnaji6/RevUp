class Main {
  public static void main(String[] args) {
    System.out.println("float to int:");
    float f = 3.99F;
    int i = (int)f;
    System.out.println(i);
    
    System.out.println("int to float:");
    f = i;
    System.out.println(f);

    int x = 10;
    float y = 3.755F;
    System.out.println(x + y);

    char c = 'A';
    System.out.println((int)c);

    char z1 = 'Z';
    System.out.println((int)z1);
  }
}