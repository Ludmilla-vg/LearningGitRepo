package nz.co.Projects.AutomationUniversityLearning.Exceptions;

public class arithmetic {
    public static void main(String[] args) throws Exception {
        System.out.println("This is the result from division method: ");
        division(10, 0);
        System.out.println("This is the result from division2 method: ");
        division2(25, 0);
    }

    public static int division(int value1, int value2) {
        int c = 0;
        try {
            c = value1 / value2;
        } catch (ArithmeticException exp) {
            System.out.println("The values cannot be divided.");
            exp.printStackTrace();
        } finally {
            System.out.println("Division is fun");
        }
        return c;
    }

    public static int division2(int value1, int value2) throws Exception {
        int c = 0;
        c = value1 / value2;
        return c;
    }
}
