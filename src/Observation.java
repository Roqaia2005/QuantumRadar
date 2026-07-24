import java.util.ArrayList;

import java.util.List;

public class Observation {
    String plateNumber;
    String date;
    String carType;
    double speed;
    boolean seatbeltFastened;
    List<Violation> violations=new ArrayList<>();


    Observation( String plateNumber, String date, String carType, double speed, boolean seatbeltFastened){

        this.plateNumber=plateNumber;
        this.date=date;
        this.carType=carType;
        this.speed=speed;
        this.seatbeltFastened=seatbeltFastened;
    }


    public String getCarType() {
        return carType;
    }


}
