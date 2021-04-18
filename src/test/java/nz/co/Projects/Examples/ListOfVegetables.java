package nz.co.Projects.Examples;

import java.util.ArrayList;
import java.util.List;

public class ListOfVegetables {
    public static void main (String [] args){
        List<String> listOfVegetables = new ArrayList<>();
        listOfVegetables.add("Capsicum");
        listOfVegetables.add("Beetroot");
        listOfVegetables.add("Carrots");
        listOfVegetables.add("Cabbage");
        listOfVegetables.add("Cauliflower");
        listOfVegetables.add("Courgette");
        listOfVegetables.add("Kumara");
        listOfVegetables.add("Potato");
        System.out.println("The list of vegetables are: " +listOfVegetables);
    }
}
