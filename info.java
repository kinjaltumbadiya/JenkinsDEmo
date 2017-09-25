import java.util.Scanner;

class demo
{
	public static void main(String argc[])
	{
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter username");  
		user = scanner.next();
		
		System.out.print("Enter password");  
		pass = scanner.next();
	
		System.out.println("Welcome" + user);
	}
}