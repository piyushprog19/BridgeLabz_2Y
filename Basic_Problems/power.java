import java.util.Scanner;
 public class power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        double exponent = in.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Power = " + result);
    }
}