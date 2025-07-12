public class DogMain {
    public static void main(String[] args){
        Dog d=new Dog("sheru",4);
        d.Bark();

        int dogyears=d.getDogYears();
        System.out.println(dogyears+" dogyears.");

        d.fetch();
        d.fetch();
        d.fetch();
    }
}
