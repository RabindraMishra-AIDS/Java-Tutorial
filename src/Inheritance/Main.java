package Inheritance;

public class Main {
    public static void main(String[] args){
        Insect ik=new Insect(3,6);
        Spider sp=new Spider(4,true);
        sp.crawl();
        sp.getAge();
        ik.says();
        sp.says();
    }
}
