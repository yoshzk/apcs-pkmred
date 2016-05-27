import java.util.*;

public class Bulbasaur extends Pokemon
{
  public Bulbasaur(int level,ArrayList<Move> moveset)
  {
    super("Bulbasaur", 2.04, 15.2, "A strange seed was planted on its back at birth. The plant sprouts and grows with this pokemon.", 001, "Grass/Poison", level, moveset);
  }
  public static void main(String [] args)
  {
    Move tackle = new Tackle();
    ArrayList<Move> bulMoves = { tackle};
    Bulbasaur starter = new Bulbasaur(5,bulMoves);
    System.out.println(starter.getMoves());
  }
  
}