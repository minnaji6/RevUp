public class Player {
  
  public String name;
  public String skill;
  public int health;
  
  public Player(String name, String skill, int health) {
   this.name = name;
   this.skill = skill;
   this.health = health;
 }

  public Player() {
    this.name = "Jerry";
    this.skill = "Flappy Flurry Fists";
    this.health = 100;
  }

  public void attack(Monster monster) {
    System.out.println(this.name + " attacks the " + monster.type + " and deals 20 damage!");
    monster.health -= 20;

    if (monster.health <= 0) {
      System.out.println("The " + monster.type + " lets out its death scream, \"" + monster.noise + "!\" and then dies.");
    } else {
      System.out.println("The " + monster.type + " is hurt and enraged!");
    }
  }
  
}