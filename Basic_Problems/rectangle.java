import java.util.Scanner;
 public class rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = in.nextDouble();
        double width = in.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter = " + perimeter);
    }
}