public class Move
{
  protected String moveName;
  protected String moveType;
  protected int movePower;
  protected double moveAccuracy;
  protected int movePP;
  
  public Move(String name,String type, int power, double accuracy, int PP)
  {
    moveName = name;
    moveType = type;
    movePower = power;
    moveAccuracy = accuracy;
    movePP = PP;
  }
}