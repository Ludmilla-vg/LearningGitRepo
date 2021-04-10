package nz.co.Projects.AutomationUniversityLearning.DataCollection;

import java.awt.*;
import java.util.*;

public class createCollections {
    public static void main(String[] args){
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("carrots");
        fruit.add("oranges");

        System.out.println("The total number of fruits is: " +fruit.size());
        System.out.println("The fruits are: " +fruit);

        ArrayList colours = new ArrayList();
        colours.add("Purple");
        colours.add("Pink");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Brown");

        System.out.println("The number of colours are: " +colours.size());
        System.out.println("The different colours are: " + colours);
        System.out.println("Get the third colour: " +colours.get(2));
        System.out.println("Display the last 2 items" + colours.subList(3,5));

        Queue workingDays = new LinkedList();
        workingDays.add("Monday");
        workingDays.add("Tuesday");
        workingDays.add("Wednesday");
        workingDays.add("Thursday");
        workingDays.add("Friday");

        System.out.println("Display the first item in the list: "+ workingDays.peek());
        System.out.println("Display the last item in the list: " + workingDays.size());

        Map pupilsId = new HashMap();
        pupilsId.put("Alice Wonderland",12345);
        pupilsId.put("Bob Builder",12346);
        pupilsId.put("Snow White", 12347);
        System.out.println("The list of pupils are: " + pupilsId);
        System.out.println("The total number of pupils are: " + pupilsId.size());
        pupilsId.putIfAbsent("Elsa and Anna", 12348);
        System.out.println("The list of pupils are: " + pupilsId);
        pupilsId.putIfAbsent("Elsa and Anna", 12349);
        System.out.println("The list of pupils are: " + pupilsId);
    }
}
