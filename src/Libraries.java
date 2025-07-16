import java.util.Random;

public class Libraries {
    //There are various usefull Libraries in Java
    //Java.net, Java.util,Java.Lang

    public static void main(String[] args){
        System.out.println("Libraries in Java");

        double power=Math.pow(5,2);
        System.out.println("5 raise to the power 2 is:"+power);

        double squareroot=Math.sqrt(64);
        System.out.println("Square Root of 64 is:"+squareroot);

        //Creating Random Numbers in Java.

        Random rand= new Random();

        int randNumber= rand.nextInt();
        System.out.println("Random Number without Bound is:"+randNumber);

        int randBoundNumber=rand.nextInt(10);
        System.out.println("Random Number with Bound is:"+randBoundNumber);

    }
}
