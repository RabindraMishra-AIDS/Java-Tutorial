import java.awt.*;

public class Car {
            boolean isEngineWorking;
            int car_id;
            double averageMilesPerGallon;
            String CarName;
            Color paintcolor;


            public Car(boolean inputEngineWorking, int inputcar_id,
                       double inputaverageMilesPerGallon, String inputCarname,Color inputpaintcolor) {

                this.isEngineWorking = inputEngineWorking;
                this.car_id=inputcar_id;
                this.averageMilesPerGallon=inputaverageMilesPerGallon;
                this.CarName=inputCarname;
                this.paintcolor=inputpaintcolor;
            }
        }