import java.util.scanner;

public class AddNumbers
{

	public static void main(String args[])
	{
		
		int x, y, z;

		System.out.println("Enter two integers to calculate their sum");
		scanner in = new scanner(System.in);

		x = in.nextInt();
		y = in.nextInt();
		z = x + y;

		System.out.println("Sum of the integers = "+z);
	}
}

//This is a comment