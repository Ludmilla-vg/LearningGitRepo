package nz.co.Projects.TryCatch;

import gherkin.lexer.Th;
import org.openqa.selenium.Alert;

public class TryCatchExample1 {
    public static void main (String [] args){
        int num1 = 20;
        int num2 = 0;
        int [] marks = new int[10];
        marks = new int[]{1,2,3,4,5,6,7,8,9,0};

        String[] countries = new String[2];
        countries = new String[]{"Mauritius","New Zealand"};

        char [] Grade = new char[5];
        Grade = new char[]{'A','B','C','D','E'};


        try{
            int num3 = num1/num2;
            System.out.println("The answer is: " +num3);
        }
     //   catch (Exception exp){
       //     System.out.println("Cannot divide a number by 0");
    //    }
        catch(ArithmeticException exp){
            System.out.println("Dividing an integer by 0 will lead to infinity");
        }

        try{
            System.out.println(Grade[6]);
        }
        catch(ArrayIndexOutOfBoundsException exp){
            System.out.println("Out of the array bound");
        }
        try{
            System.out.println("Accept the alert");
        }
        catch(Throwable al){
            System.out.println("Throwable");
        }
    }
}
