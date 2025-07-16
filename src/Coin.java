import java.util.Random;

public class Coin {
    private int faceUP;
    public final static int HEADS=0;
    public final static int TAILS=1;

    public Coin(){
        flip();
    }

    public void flip(){

        Random rand= new Random();
        faceUP =rand.nextInt(2);
    }

    public String getFaceup(){
        if(faceUP==HEADS)
            return "Heads";
        else if (faceUP==TAILS)
            return "Tails";
        else
            return "Invalid";
    }

    public static void main(String[] args){
        System.out.println("------ Coin Flip -----");
        Coin c = new Coin();
        System.out.println("Initial Value:"+ c.getFaceup());
        for(int i=0;i<5;i++){
            c.flip();
            System.out.println("After Flip:"+ c.getFaceup());
        }
    }
}
