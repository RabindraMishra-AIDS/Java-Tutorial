import java.util.Random;

public class DiceRoll {
    Random rand;

    public DiceRoll(){
        this.rand=new Random();
    }

    public int Rollup(){
        int roll=this.rand.nextInt(6)+1; //used for method chaining.
        return roll;
    }

    public static void main(String[] args){
        System.out.println("---------- Welcome to Dice Game---------------");
        DiceRoll d= new DiceRoll();
        for (int i=0;i<3;i++){
            System.out.println("Current Dice Value is:"+d.Rollup() );
        }
    }
}
