package Inheritance;
public class Insect {
    int age;
    int numberofLegs;
    public Insect(int age,int num){
        this.age=age;
        this.numberofLegs=num;
    }
    public void says(){
        System.out.println("......");
    }
    public void crawl(){
        System.out.println("Crawl insect");
    }
    //Keyword: extend is used for inheritance
}
