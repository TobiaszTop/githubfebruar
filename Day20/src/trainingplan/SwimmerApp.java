package trainingplan;

import java.util.ArrayList;

public class SwimmerApp {
    
    public static void main(String[] args) {

        TrainingPlan planA = new TrainingPlan('A', 16, 10);
        TrainingPlan planB = new TrainingPlan('B', 10, 6);

        ArrayList<Double> lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
        lapTimes.add(1.01);
        lapTimes.add(0.99);
        lapTimes.add(0.98);
        lapTimes.add(1.02);
        lapTimes.add(1.04);
        lapTimes.add(0.99);
        Swimmer s1 = new Swimmer("Jan", 1994, lapTimes, "AGF");
        //s1.setGroup(planA);
        System.out.println(s1.getName() + " " +s1.allTrainingHours());

        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.01);
        lapTimes.add(1.04);
        lapTimes.add(1.06);
        lapTimes.add(1.08);
        lapTimes.add(1.04);
        lapTimes.add(1.02);
        Swimmer s2 = new Swimmer("Bo", 1995, lapTimes, "Lyseng");
        //s2.setGroup(planA);
        System.out.println(s2.getName() + " " +s2.allTrainingHours());

        lapTimes = new ArrayList<>();
        lapTimes.add(1.03);
        lapTimes.add(1.01);
        lapTimes.add(1.02);
        lapTimes.add(1.05);
        lapTimes.add(1.03);
        lapTimes.add(1.06);
        lapTimes.add(1.03);
        Swimmer s3 = new Swimmer("Mikkel", 1993, lapTimes, "AIA-Tranbjerg");
        //s3.setGroup(planB);
        System.out.println(s3.getName() + " " +s3.allTrainingHours());

        planA.addSwimmer(s1);
        planA.addSwimmer(s2);
        planB.addSwimmer(s3);

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(s1);
        swimmers.add(s2);
        swimmers.add(s3);

        for (int i=0; i<planA.getSwimmers().size(); i++) {
            System.out.println(planA.getSwimmers());
        }

    }
    
}
