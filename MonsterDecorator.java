public abstract class MonsterDecorator extends Monster
{
  /**
  * Monster to be decorated
  */
  private Monster monster;

  /**
  * Constructor that creates monsterdecorator for a monster object
  *
  * @param newMonster Monster to be decorated with new abilities
  * @param newName New Name for monster after getting appended with abilities
  * @param newHP New Hp for monster after getting appended with abilities
  */
  public MonsterDecorator(Monster newMonster, String newName, int newHP)
  {
    super(newName, newHP);
    monster = newMonster;
  }

  /**
  * Attack function that uses the passed in monster's attack
  */
  public int attack()
  {
    return monster.attack();
  }

}