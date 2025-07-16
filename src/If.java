import java.util.Scanner;

public class If {
    public static void main( String[] args){
        System.out.println("Enter Your Age:");
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();

        if (age>=0 && age<=5){
            System.out.println("Baby");
        }
        else if (age>5 && age<=15){
            System.out.println("Kid");
        }
        else if (age>15 && age<=60){
            System.out.println("Adult");
        }
        else if (age>60){
            System.out.println("Senior Citizen");
        }
        else{
            System.out.println("Invalid Age Input");
        }

        System.out.println("Thank You for Using this Program");
    }
}
