//my name: Roqaia Hassan
//Computer science fresh grad cairo university
//email:roqaiahassanahmed@gmail.com
public class Main {
    public static void main(String[] args) {


        Radar quantumRadar= new Radar();
        Observation observation1=new Observation("ABC1234", "1-3-2025","Private",94.0,true);
        Observation observation2=new Observation("ABC5678", "1-4-2025","Truck",61.0,false);
        quantumRadar.checkObservation(observation1);
        quantumRadar.checkObservation(observation2);


        quantumRadar.createFine(observation1);
        quantumRadar.createFine(observation2);


        quantumRadar.getAllFines();



        quantumRadar.getAllViolatedRules();


    }
}