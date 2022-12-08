public class Less implements Guess{
  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  Less (String value){
    this.value = value;
  }

  Less(){
    
  }
  @Override
  public double hint(int randomNum, int userGuess) {
      return userGuess + randomNum;
  }
    @Override
  public double hint(float randomNum, float userGuess) {
      return userGuess + randomNum;
  }
}