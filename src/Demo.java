import java.awt.*;

public class Demo {

    public static void main(String[] args)
{
    System.out.println("Hello World");

    Car mycar=new Car(true,1,40.7,"Ford", Color.BLUE);
    Car friendCar=new Car(false,2,33.67,"Ferrari",Color.RED);

    System.out.println("Is mycar engine working:"+ mycar.isEngineWorking +" id:"+ mycar.car_id + " color:"+mycar.paintcolor+" name:"+mycar.CarName);
    //We can print color as string instead of rgb value.
    System.out.println("Is FriendCar engine working:"+ friendCar.isEngineWorking +" id:"+ friendCar.car_id + " color:"+friendCar.paintcolor.toString()+" name:"+friendCar.CarName);


}

}
