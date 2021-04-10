package nz.co.Framework.HelperClasses;

import org.apache.commons.io.FileUtils;
import sun.reflect.annotation.ExceptionProxy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    //Create a file
    public static void createANewFile(String fileDirectory) {
        File myFile = new File(fileDirectory);
        try {
            FileUtils.touch(myFile);
        } catch (Exception exp) {
            System.out.println("The file has not been created.");
            exp.printStackTrace();
        }
    }

    //Delete a file
    public static void deleteAFile(String fileDirectory) {
        File myFile = new File(fileDirectory);
        try {
            FileUtils.deleteQuietly(myFile);
        } catch (Exception exp) {
            System.out.println("The file has not been deleted.");
            exp.printStackTrace();
        }
    }

    //Add 1 line to the file
    public static void addALineToTheFile(String fileDirectory, String lineToAdd) {
        File myFile = new File(fileDirectory);
        try {
            FileUtils.writeStringToFile(myFile, lineToAdd, "UTF-8");
        } catch (Exception exp) {
            exp.printStackTrace();
            System.out.println("The line has not been added to the file");
        }
    }

    //Add multiple lines to the file
    public static void addMultipleLinesToTheFile(String fileDirectory, ArrayList<String> linesToAdd) {
        File myFile = new File(fileDirectory);
        try {
            FileUtils.writeLines(myFile, linesToAdd);
        } catch (Exception exp) {
            System.out.println("The multiple lines have not been added");
            exp.printStackTrace();
        }
    }

    //Read the single line from a file
    public static void readTheSingleLineFromAFile(String fileDirectory) {
        File myFile = new File(fileDirectory);
        String singleLineFromFile = null;
        try {
            singleLineFromFile = FileUtils.readFileToString(myFile, "UTF-8");
            System.out.println(singleLineFromFile);
        } catch (Exception exp) {
            exp.printStackTrace();
            System.out.println("Cannot read from the file");
        }
    }

    //Read all the lines from a file
    public static void readMultipleLinesFromAFile(String fileDirectory) {
        File myFile = new File(fileDirectory);
        List<String> linesToRead = null;

        try {
            linesToRead = FileUtils.readLines(myFile, "UTF-8");
            System.out.println(linesToRead);
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }
}


