package helloworld;
import java.util.Scanner;
public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Automation");
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number= ");
		 int a = scanner.nextInt();
		 System.out.println("Enter second number");
		 int b = scanner.nextInt();
		System.out.println("Addition= "+(a+b));
		System.out.println("Subtraction= "+(a-b));
		System.out.println("Multiplication= "+(a*b));
		System.out.println("Division= "+(a/b));
	}

}
