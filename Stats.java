import java.util.*;

public class Stats
{
  protected int healthStat;
  protected int attackStat;
  protected int defenseStat;
  protected int speedStat;
  protected int specialStat;
  
  public Stats(int hp, int attack, int defense, int speed, int spec)
  {
    healthStat = hp;
    attackStat = attack;
    defenseStat = defense;
    speedStat = speed;
    specialStat = spec;
  }
  protected static ArrayList<Stats> allBaseStats = new ArrayList<Stats>()
  {{
    add(new Stats(45,49,49,45,65)); //bulbasaur
    add(new Stats(60,62,63,60,80));
    add(new Stats(80,82,83,80,100));
    add(new Stats(39,52,43,65,50));
    add(new Stats(58,64,58,80,65));
    add(new Stats(78,84,48,100,85));
    add(new Stats(44,48,65,43,50));
    add(new Stats(59,63,80,58,65));
    add(new Stats(79,83,100,78,85));
    add(new Stats(45,30,35,45,20));
    add(new Stats(50,20,55,30,25));
    add(new Stats(60,45,50,70,80));
    add(new Stats(40,35,30,50,20));
    add(new Stats(45,25,50,35,25));
    add(new Stats(65,80,40,75,45));
    add(new Stats(40,45,40,56,35));
    add(new Stats(63,60,55,71,50));
    add(new Stats(83,80,75,91,70));
    add(new Stats(30,56,35,72,25));
    add(new Stats(55,81,60,97,50));
    add(new Stats(40,60,30,70,31));
    add(new Stats(65,90,65,100,61));
    add(new Stats(35,60,44,55,40));
    add(new Stats(60,85,69,80,65));
    add(new Stats(35,55,30,90,50));
    add(new Stats(60,90,55,100,90));
    add(new Stats(50,75,85,40,30));
    add(new Stats(75,100,110,65,55));
    add(new Stats(55,47,52,41,40));
    add(new Stats(70,62,67,56,55));
    add(new Stats(90, 82, 87, 76, 75));
    add(new Stats(46,57,40,50,40));
    add(new Stats(61,72,57,65,55)); //nidoran
    add(new Stats(81,92,77,85,75));
    add(new Stats(70,45,48,35,60));
    add(new Stats(95,70,73,60,85));
    add(new Stats(38,41,40,65,65));
    add(new Stats(73,76,75,100,100));
    add(new Stats(115,45,20,20,25));
    add(new Stats(140,70,45,45,50));
    add(new Stats(40,45,35,55,40));
    add(new Stats(75,80,70,90,75));
    add(new Stats(45,50,55,30,75));
    add(new Stats(60,65,70,40,85));
    add(new Stats(75,80,85,50,100));
    add(new Stats(35,70,55,25,55));
    add(new Stats(60,95,80,30,80));
    add(new Stats(60,55,50,45,40));
    add(new Stats(70,65,60,90,90));
    add(new Stats(10,55,25,95,45));
    add(new Stats(35,80,50,120,70));
    
  }};
    
    
    
  
  public int getHP()
  {
    return healthStat;
  }
  public int getAttack()
  {
    return attackStat;
  }
  public int getDefense()
  {
    return defenseStat;
  }
  public int getSpeed()
  {
    return speedStat;
  }
  public int getSpecial()
  {
    return specialStat;
  }
}
    