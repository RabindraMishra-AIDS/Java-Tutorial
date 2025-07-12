
import java.util.Scanner;
public class Scanner1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); //for taking integers as inputs;

        int user_id=sc.nextInt();

        double salary=sc.nextDouble();


        System.out.println(input.toLowerCase());
        System.out.println(input.toUpperCase());
        System.out.println(input.charAt(8));
        System.out.println(user_id);

    }

}
