package Inheritance;

public class Spider extends Insect{
    boolean isPosion;
    public  Spider( int age, boolean ispoison){
        super(age,9);
        this.isPosion=ispoison;
    }
    public void says(){
        System.out.println("Tumk_spider");
    }
    public void jump(){
        System.out.println("Spider Juping");
    }
    public void getAge(){
        System.out.println("Age of spider is:"+ this.age);
    }
}
