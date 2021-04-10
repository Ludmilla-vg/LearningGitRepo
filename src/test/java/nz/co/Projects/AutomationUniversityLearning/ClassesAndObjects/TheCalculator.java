package nz.co.Projects.AutomationUniversityLearning.ClassesAndObjects;

public class TheCalculator {
    public static void main(String [] args){
        Rectangle rectangle1 = new Rectangle(10,20);
        System.out.println("The area of the rectangle is: "+ rectangle1.calculateArea());
        System.out.println("The perimeter of the rectangle is: "+rectangle1.calculatePerimeter());
    }
}
