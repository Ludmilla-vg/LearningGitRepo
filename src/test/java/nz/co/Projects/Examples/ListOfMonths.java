package nz.co.Projects.Examples;

import java.util.ArrayList;
import java.util.List;

public class ListOfMonths {
    public static void main (String [] args) {
        List<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        System.out.println("The list of months are:" + months);
    }
}
