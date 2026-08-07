import java.util.Scanner;
 public class Simple_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double prin = in.nextDouble();
        double rate = in.nextDouble();
        double time = in.nextDouble();
        double si = (prin * rate * time) / 100;
        System.out.println("Simple Interest = " + si);
    }
}