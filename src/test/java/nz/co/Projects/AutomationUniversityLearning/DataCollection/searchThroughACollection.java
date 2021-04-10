package nz.co.Projects.AutomationUniversityLearning.DataCollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class searchThroughACollection {
    public static void main(String [] args){
        vegetablesListUsingSet();
        childrenListUsingMaps();
    }

    public static void vegetablesListUsingSet(){
        Set<String> listOfVegetables = new HashSet();
        listOfVegetables.add("Cabbage");
        listOfVegetables.add("Cauliflower");
        listOfVegetables.add("Broccoli");
        listOfVegetables.add("Beetroot");

        for(String item: listOfVegetables){
            System.out.println(item);
        }

        System.out.println("When using Lambdas: ");
        listOfVegetables.forEach(x -> System.out.println(x));

        System.out.println("When using cleaner Lambdas: ");
        listOfVegetables.forEach(System.out::println);
    }

    public static void childrenListUsingMaps(){
        Map<String,String> childrenList = new HashMap<>();
        childrenList.put("1","Alice Wonderland");
        childrenList.put("2","Bob Builder");
        childrenList.put("3","Cinderella");
        childrenList.put("4","David Copperfield");
        childrenList.put("5","Elton John");

        childrenList.forEach((k,v) ->System.out.println("The id is: " + k +" and the name is: "+ v));

        }

}
