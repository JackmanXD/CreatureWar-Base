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
            int Evil = 0; // evil army
            
            while(Good < troopCount && Evil < troopCount){
            
                System.out.println("The Eternal Conflict begins anew. Awaken champions, and fufill your DESTINY!!!!!");
                System.out.println("");
                System.out.println("");
                
                good.get(Good).takeDamage(evil.get(Evil).damage()); //good army takes damage
                
                System.out.println("");
                
                System.out.println("Evil " + Evil + " Attack Damage is " + evil.get(Good).damage() + 
                " towards " + Good + " the heroic creatures! ");
                
                System.out.println("");
                
                evil.get(Evil).takeDamage(good.get(Good).damage()); // evil army takes damage
                
                System.out.println("Good " + Good + " Attack Damage is " + good.get(Evil).damage() + 
                " towards " + Evil + " the demonic hoard! ");
                
                System.out.println("");
                
                if(good.get(Good).isAlive() != true){
                    System.out.println("Good " + Good + " Soldier is slain. Another casuality of the forces of light. ");
                    Good++;
                }
                if(evil.get(Evil).isAlive() != true){
                    System.out.println("Evil " + Evil + " Soldier is slain. A small dent against the tide of darkness. ");
                    Evil++;
                }
                System.out.println("The battle rages on as new fighters move foward...");
                System.out.println("");
                System.out.println("");
            }
            System.out.println("The battle draws to a close...");
            if(Good < Evil){
                System.out.println("The forces of light have triumphed today, but how long will peace last?");
            }
            else if(Evil < Good){
                System.out.println("Darkness has consmed all hope in this land, but their reign will not last...");
            }
            else{
            System.out.println("The balance holds, at least until the next inevatable conflict...");
            }
        }
}