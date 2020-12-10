public class Zombie extends Monster
{
  /**
  * Constructor for this class. Sets the initial HP and name for the Zombie
  */
  public Zombie()
  {
    super("Zombie", 9);
  }

  /**
  * Returns the base attack power of the Zombie
  * @return - returns 2 which is the base attack power of the Zombie
  */
  public int attack()
  {
    return 2;
  }
}