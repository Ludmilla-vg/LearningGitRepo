package nz.co.Projects.AutomationUniversityLearning.Exceptions;

import java.io.File;
import java.io.IOException;

public class createANewFileOneException {
    public static void main(String[] args) {
        File myFile = new File("C:/Users/ludmilla.chellemben/example1.txt");
        try {
            myFile.createNewFile();
        } catch (Exception exp) {
            System.out.println("The file was not created");
            exp.printStackTrace();
        }
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println("The sum of the 2 numbers is: " + sum);
    }
}
