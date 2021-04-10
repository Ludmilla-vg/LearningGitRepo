package nz.co.Projects.AutomationUniversityLearning.ClassesAndObjects;

public class Rectangle {
    private int width;
    private int length;

    Rectangle(int _actualWidth,int _actualLength){
        this.length = _actualLength;
        this.width = _actualWidth;
    }

    public int calculateArea(){
        int area = length * width;
        return area;
    }

    public int calculatePerimeter(){
        int perimeter = (width+length)*2;
        return perimeter;
    }
}
