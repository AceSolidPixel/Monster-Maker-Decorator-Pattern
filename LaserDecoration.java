/**
* Laser Decoration that adds extra hp, new name, and attack damage
* to a monster
*/
public class LaserDecoration extends MonsterDecorator
{
  /**
  * Adds with lasers adjective and new laser stats to passed in monster
  *
  * @param newMonster Monster to have laser ability added to
  */
  public LaserDecoration(Monster newMonster)
  {
    super(newMonster, newMonster.getName() + " with Laser Beams", newMonster.getHP() + 5);
  }
  
  /**
  * Updates attack function to increase damage by 7
  *
  * @return New attack damage with laser addition
  */
  public int attack()
  {
    final int LASER_DAMAGE = 7;
    return super.attack() + LASER_DAMAGE; 
  }
}