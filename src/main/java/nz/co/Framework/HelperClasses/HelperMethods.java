package nz.co.Framework.HelperClasses;

import java.util.Random;

public class HelperMethods {
    public static String generateRandomString(int stringLength) {
        String listOfCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklimnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder generatedRandomString = new StringBuilder();

        for (int i = 0; i < stringLength; i++) {
            int randomIndex = random.nextInt(listOfCharacters.length());
            generatedRandomString.append(listOfCharacters.charAt(randomIndex));
        }
        return generatedRandomString.toString();
    }

    public static String generateRandomInteger(int stringLength) {
        String listOfIntegers = "1234567890";
        Random random = new Random();
        StringBuilder generateRandomIntegers = new StringBuilder();

        for (int i = 0; i < stringLength; i++) {
            int randomIndex = random.nextInt(listOfIntegers.length());
            generateRandomIntegers.append(listOfIntegers.charAt(randomIndex));
        }
        return generateRandomIntegers.toString();
    }

    public static String generateRandomSpecialCharacters(int stringLength) {
        String listOfpecialCharacters = "!@#$%^&*()";
        Random random = new Random();
        StringBuilder generatedRandomSpecialCharacters = new StringBuilder();

        for (int i = 0; i < stringLength; i++) {
            int randomIndex = random.nextInt(listOfpecialCharacters.length());
            generatedRandomSpecialCharacters.append(listOfpecialCharacters.charAt(randomIndex));
        }
        return generatedRandomSpecialCharacters.toString();
    }

    public static String changeTheFirstCharacterToUpperCase(String inputString) {
        char c[] = inputString.toCharArray();
        c[0] = Character.toUpperCase(c[0]);
        return new String(c);
    }

    public static String changeTheFirstCharacterToLowerCase(String inputString) {
        char c[] = inputString.toCharArray();
        c[0] = Character.toLowerCase(c[0]);
        return new String(c);
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
