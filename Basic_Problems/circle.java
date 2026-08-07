import java.util.Scanner;

 public class circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area = " + area);
    }
}