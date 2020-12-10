/**
* Purpose: The purpose of this lab is to use the decoration design pattern 
*          to create a monster maker where different types of monsters get 
*          decorated with different abilities.
*
* Names: Blake Del Rey and Prince Angulo
* Date: 11 - 17 - 2020
*/
class Main 
{
  public static void main(String[] args) 
  {
    //Variables used for the maximum and minimum values of the menus
    final int MIN_MONSTER_INPUT = 1;
    final int MAX_MONSTER_INPUT = 3;

    final int MIN_ABILITY_INPUT = 1;
    final int MAX_ABILITY_INPUT = 4;

    Monster mon = new Alien();
    int menuInput = 0;
    
    //Prompt User with a menu of monster types
    System.out.println("Monster Creator!");
    System.out.println("Choose a base monster: ");
    System.out.println("1. Alien");
    System.out.println("2. Beast");
    System.out.println("3. Zombie");
    menuInput = CheckInput.getIntRange(MIN_MONSTER_INPUT, MAX_MONSTER_INPUT);
    
    //Select monster type based on user input
    if(menuInput == 1)
    {
      mon = new Alien();
    }
    if(menuInput == 2)
    {
      mon = new Beast();
    }
    if(menuInput == 3)
    {
      mon = new Zombie();
    }

    menuInput = 0;
    while(menuInput != 4) //While loop that will loop until the user quits
    {
      
      System.out.println(mon.getName() + " has " + mon.getHP() + " hp " 
                        + "and attacks for " + mon.attack() + " damage.");
      System.out.println("Add an ability: \n1. Fire \n2. Lasers \n3. Poison \n4. Quit");
      menuInput = CheckInput.getIntRange(MIN_ABILITY_INPUT, MAX_ABILITY_INPUT);
      
      //Select ability to add to monster based on user input
      if (menuInput == 1)
      {
        mon = new FireDecoration(mon);
      }
      if (menuInput == 2)
      {
        mon = new LaserDecoration(mon);
      }
      if (menuInput == 3)
      {
        mon = new PoisonDecoration(mon);
      }
      if(menuInput == 4)
      {
        System.out.println("Exiting");
      }
    }
  }
}