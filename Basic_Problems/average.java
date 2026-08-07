import java.util.Scanner;
 public class average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double average = (a + b + c) / 3;
        System.out.println("Average = " + average);
    }
}