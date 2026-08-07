import java.util.Scanner;
public class celciusConv{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("temp in celsius");
int c = in.nextInt();
int fahrenheit = ((c*9/5)+32);
System.out.println("temp in fehrenheit:" +fahrenheit);
}
}