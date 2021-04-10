package nz.co.Projects.AutomationUniversityLearning.DataCollection;

import java.util.Map;

public class DisplayTheFinalMarksOfEachStudent {
    public static void main (String [] args){
        Map<String,Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String,Integer> makeUpGrades = TestResults.getMakeUpGrades();
        System.out.println(originalGrades);
        System.out.println(makeUpGrades);

        originalGrades.forEach((k,v) -> {
                if (v< makeUpGrades.get(k)){
                    v = makeUpGrades.get(k);
                }
                System.out.println("The correct mark for " + k + " is: " +v);
        });
    }
}
