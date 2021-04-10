package nz.co.Projects.AutomationUniversityLearning.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class createANewFileTwoExceptions {
    public static void main(String [] args){
     // createAFile();
      readAFile();
    }
    public static void createAFile(){
        File file1 = new File("C:/Users/ludmilla.chellembenn/file1.txt");
        try{
            file1.createNewFile();
        }
        catch(IOException exp){
            System.out.println("The file was not created");
            exp.printStackTrace();
        }
    }

    public static void readAFile(){
        File file2 = new File("C:/Users/ludmilla.chellembenn/file1.txt");
        try{
            Scanner readFile = new Scanner(file2);
            while (readFile.hasNext()){
                double num = readFile.nextDouble();
                System.out.println(num);
            }
        }
        catch(FileNotFoundException | InputMismatchException exp){
            exp.printStackTrace();
        }
        catch (Exception exp){
            exp.printStackTrace();
        }
        finally{
            System.out.println("my name is ludmilla chellemben");
        }
    }
}
