public class SeatBeltRule extends Rule {


    SeatBeltRule(double fee){
        this.fee=fee;
    }
    @Override
    Violation check(Observation observation) {

        if(!observation.seatbeltFastened){
           return new Violation("SeatBelt Rule","Seatbelt not fastned",fee);

        }
        return  null;

    }
}
