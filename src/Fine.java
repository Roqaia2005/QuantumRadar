import java.util.List;

public class Fine {

    String plateNumber;

    List<Violation>violations;

    int totalAmount;



    Fine(String plateNumber, List<Violation>violations){
        this.plateNumber=plateNumber;
        this.violations=violations;
    }

    String returnAllViolations(List<Violation> violations) {

        StringBuilder result = new StringBuilder();

        for (Violation violation : violations) {
            result.append(violation.message)
                    .append(" : ")
                    .append(violation.fee)
                    .append(" EGP\n");
        }

        return result.toString();
    }
   void makeFine(){

        for(Violation violation:violations){
            totalAmount+=violation.fee;
        }



        System.out.println("Traffic fine for car "+plateNumber+"\n"+"Total amount: "+totalAmount+"\nViolations:"+returnAllViolations(violations));

    }


    public int getTotalAmount() {
        return totalAmount;
    }


    public String getPlateNumber() {
        return plateNumber;
    }
}
