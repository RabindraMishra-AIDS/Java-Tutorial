package Interface;

import java.util.Random;

public class Main {

public static void main(String[] args){
    Dog d= new Dog();
    Cat c= new Cat();
    //Interfaces in Java are only used to define behaviour but not implementations
    d.play();
    c.play();

    Pet p;
    Random r = new Random();
    int n= r.nextInt(2);
    if (n==0){
        p=new Dog(); //Randomly creating a instance
    }
    else{
        p=new Cat();
    }
    p.play();
}

}

