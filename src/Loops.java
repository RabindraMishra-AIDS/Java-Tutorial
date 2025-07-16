import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=3;
        System.out.println("-------------While Loops-------------");
        while (x>0) {
            System.out.println("Value of x:"+x);
            x=x-1;
        }
        int y=3;
        System.out.println("--------- Do While Loop ----------------");
        //Do while : Here statements are executed before checking the condition.
        do {
            System.out.println("Value of y:" +y);
            y=y-1;
        }while(y>0);

        //For Loop
        System.out.println("-------- For Loop ---------------");
        for (int i =0;i<4;i++){
            System.out.println("Value of i:"+i);
        }

        System.out.print("Thanks!!");
    }

}
