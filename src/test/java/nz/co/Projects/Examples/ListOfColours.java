package nz.co.Projects.Examples;

import java.util.ArrayList;
import java.util.List;

public class ListOfColours {
    public static void main(String[] args) {
        List<String> listOfColours = new ArrayList<>();
        List<String> listOfBabiesColours = new ArrayList<>();
        List<String> listOfNZFlag = new ArrayList<>();
        System.out.println("The mauritian flag: ");
        listOfColours.add("Red");
        listOfColours.add("Blue");
        listOfColours.add("Yellow");
        listOfColours.add("Green");

        System.out.println("Some babies colours are: ");
        listOfBabiesColours.add("pink");
        listOfBabiesColours.add("blue");
        listOfBabiesColours.add("white");
        listOfBabiesColours.add("purple");
        System.out.println(listOfColours);


        System.out.println("The New Zealand Flag: ");
        listOfNZFlag.add("WHITE");
        listOfNZFlag.add("RED");
        listOfNZFlag.add("BLUE");

        System.out.println("NO MORE COLOURS TO ADD");

    }
}


