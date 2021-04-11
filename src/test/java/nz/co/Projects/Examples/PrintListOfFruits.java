package nz.co.Projects.Examples;

import java.util.ArrayList;
import java.util.List;

public class PrintListOfFruits {
    public static class PrintLisfOfFruits {
        public static void main (String[] args){
            System.out.println("The list of fruits are: ");
            List<String> listOfFruits = new ArrayList<>();
            listOfFruits.add("Apple");
            listOfFruits.add("Banana");
            listOfFruits.add("Cherry");
            listOfFruits.add("Dragon Fruit");
            System.out.println(listOfFruits);
        }
    }
}
