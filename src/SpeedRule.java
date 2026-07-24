public class SpeedRule extends Rule{


    String carType;
    double speedLimit;

    public double getSpeedLimit() {
        return speedLimit;
    }//this when I need to get speed limit to check if it is violated or not

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit; //and this to set it based on car type
    }

    SpeedRule(double speedLimit,String carType,double fee){
        this.speedLimit=speedLimit;

        this.carType=carType;

        this.fee=fee;
    }

    @Override
    Violation check(Observation observation) {
        if (observation.carType.equals(carType) &&
                observation.speed > speedLimit) {

            return new Violation(
                    "Speed Rule",
                    "Speed of "+observation.speed+" exceeded the maximum allowed "+speedLimit,
                    fee

            );
        }

        return null;
    }
}
