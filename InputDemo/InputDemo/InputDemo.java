import java.lang.*;
import java.util.Scanner;

public class InputDemo
{
	public static void main(String args[])
	{
		String s1, s2;
		int i;
		double d;
		char c;
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("Enter a line: ");
		s1 = sc.nextLine();
		System.out.println("You have entered: " + s1);*/
		
		System.out.print("Enter a Word: ");
		s2 = sc.next();
		System.out.println("You have entered: " + s2);
		
		System.out.print("Enter an Integer: ");
		i = sc.nextInt();
		System.out.println("You have entered: " + i);
		
		System.out.print("Enter a double: ");
		d = sc.nextDouble();
		System.out.println("You have entered: " + d);
		
		System.out.print("Enter a Char: ");
		c = sc.next().charAt(0);
		System.out.println("You have entered: " + c);
		
		/*System.out.print("Enter a line: ");
		s1 = sc.nextLine();
		System.out.println("You have entered: " + s1);*/
	}
}