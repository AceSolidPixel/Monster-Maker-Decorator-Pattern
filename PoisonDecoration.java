/**
* Poison Decoration that adds extra hp, new name, and attack damage
* to a monster
*/
public class PoisonDecoration extends MonsterDecorator
{
  /**
  * Adds poisonous adjective and new poison stats to passed in monster
  *
  * @param newMonster Monster to get appended with posion abilities
  */
  public PoisonDecoration(Monster newMonster)
  {
    super(newMonster, "Poisonous " + newMonster.getName(), newMonster.getHP() + 4);
  }
  
  /**
  * Updates attack function to increase damage by 3
  *
  * @return New attack damage with poison addition
  */
  public int attack()
  {
    final int POISON_DAMAGE = 3;
    return super.attack() + POISON_DAMAGE; 
  }
}