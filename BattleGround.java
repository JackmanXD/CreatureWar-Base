import java.util.ArrayList;
import java.util.Random;

/**
 * This is where the magic happens.  
 * Armies are assembled and pitted against each other 
 * until the battle is over, which has either one side winning, or a draw.
 *
 * @author Jack Henry Protopapa
 * @version v0.1
 */

public class BattleGround
{
    public Random rand = new Random();
    private ArrayList<Creature> good;
    private ArrayList<Creature> evil;
    int troopCount = rand.nextInt(8);
    
        public BattleGround(){
            good = new ArrayList<Creature>();
            evil = new ArrayList<Creature>();
        
        }
        public Creature addTroop(){ // # of creatures added to list.
           Random rand = new Random();
            int creature = rand.nextInt(4);
            if(creature == 0){
                return new Human();
        }
            if(creature == 1){
                return new Elf();
        }
            if(creature == 2){
                return new Demon();
        }
                return new CyberDemon();
        }
        
        public void createSides(){ // randomized army assembly
            for(int Side = 0; Side < troopCount; Side++){
                good.add(addTroop());
                evil.add(addTroop());
        }
    }
        public void newWar(){ // war play by play
            
            int Good = 0; // good army
            int Evil = 0; //evil army
            
            while(Good < troopCount && Evil < troopCount){
            
                System.out.println("The Eternal Conflict begins anew. Awaken, champions, and fufill your DESTINY!!!!!");
                System.out.println("");
                System.out.println("");
                
                //good.get(Good1).takeDamage
            }
    }
}