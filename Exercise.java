import java.util.Scanner;
public class Exercise {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    MyRectangle myRectangle = new MyRectangle(4, 40);
    myRectangle.width = input.nextDouble();
    myRectangle.height = input.nextDouble();
    System.out.println("宽为" +  myRectangle.width + "  高为 " + myRectangle.height + "  面积为 " +myRectangle.getArea());
    System.out.println("周长为 " + myRectangle.getPerimeter());
  }
}
 
class MyRectangle {
   double width = 1, height = 1;

   public MyRectangle() {
   }
     
    public MyRectangle(double newWidth, double newHeight) {
       width = newWidth;
       height = newHeight;
    }
     
    public double getArea() {
       return width * height;
    }
     
    public double getPerimeter() {
       return 2 * (width + height);
    }
}