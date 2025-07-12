public class ArgumentcallbyValue {
    //In Java arguments are called by Value
    //it means that arguments arent modified unless returned


    public double Speedup(double speed){
        speed+=100;
        return speed;
    }

    public static void main(String[] args){
        double carspeed=10;
        ArgumentcallbyValue myObject= new ArgumentcallbyValue();
        carspeed=myObject.Speedup(carspeed);
        System.out.println(carspeed);

    }
}
