import javax.swing.plaf.SplitPaneUI;
import java.util.*;
import java.util.ArrayList;

public class Radar {

    List<Rule>rules=new ArrayList<>();
    List<Fine>fineList=new ArrayList<>();

    {
        rules.add(new SpeedRule(80,"Private",300));
        rules.add(new SpeedRule(60,"Truck",400));
        rules.add(new SeatBeltRule(100) );

    }

    void checkObservation(Observation observation){

     for(Rule rule : rules){

         Violation violation = rule.check(observation);

             if (violation != null) {
                 observation.violations.add(violation);
             }


     }
    }

    void createFine(Observation observation) {
        if (observation.violations.isEmpty()) {
            return;
        }

        Fine fine = new Fine(observation.plateNumber, observation.violations);
        fine.makeFine();
        fineList.add(fine);
    }


    void getAllFines() {
        if(fineList.isEmpty()){
            System.out.println("No fines generated");
        }
else{
    System.out.println("All generated fines:");
            for (Fine fine : fineList) {

                System.out.println(
                        fine.getPlateNumber() + " : " + fine.getTotalAmount() + " EGP"
                );
            }

        }

    }

    void getAllViolatedRules() {
        if(fineList.isEmpty()){
            System.out.println("No Violated rules");
        }

        else{
            System.out.println("\nAll violated rules:");
            Map<String, Integer> count = new HashMap<>();

            for (Fine fine : fineList) {
                for (Violation violation : fine.violations) {
                    count.put(
                            violation.ruleName,
                            count.getOrDefault(violation.ruleName, 0) + 1
                    );
                }
            }

            for (String ruleName : count.keySet()) {

                System.out.println(ruleName + " : " + count.get(ruleName));
            }

        }

    }



}
