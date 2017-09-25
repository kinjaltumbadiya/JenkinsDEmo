import java.util.Scanner;

class demo
{
	public static void main(String argc[])
	{
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter username");  
		user = scanner.next();
		
		System.out.println("Enter password");  
		pass = scanner.next();
	
		System.out.println("Welcome" + user);
	}
}