package nz.co.Projects.Examples;

import cucumber.api.java.cs.A;
import gherkin.lexer.Ar;

import java.util.ArrayList;
import java.util.List;

public class PrintListOfFruits {
        public static void main (String[] args) {
            System.out.println("The list of fruits are as below: ");
            List<String> listOfFruits = new ArrayList<>();
            List<String> listOfShapes = new ArrayList<>();
            listOfFruits.add("Apple");
            listOfFruits.add("Banana");
            listOfFruits.add("Cherry");
            listOfFruits.add("Dragon Fruit");
            listOfFruits.add("Kiwifruit");
            listOfFruits.add("Strawberry");
            listOfFruits.add("Pineapple");
            listOfFruits.add("Peach");
            listOfFruits.add("blueberry");
            listOfFruits.add("raspberry");
            listOfFruits.add("papaya");
            listOfFruits.add("Avocado");
            System.out.println(listOfFruits);
            System.out.println("Add 2 more  mauritian fruits: ");
            listOfFruits.add("jamblon");
            listOfFruits.add("jambalac");
            System.out.println(listOfFruits);

            System.out.println("The list of shapes:");
            listOfShapes.add("SQUARE");
            listOfShapes.add("RECTANGLE");
            listOfShapes.add("CIRCLE");
            listOfShapes.add("TRIANGLE");
        }
}
