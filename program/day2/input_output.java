import java.util.*;

public class input_output
{
	public static void main(String[] args) {
		System.out.println("नमस्ते World");
		// java uses unicode encoding so so we can use use any charachter and it prints it
		//unicode used uses hexa decimal values ,utf-8,16,32 is used
		Scanner sc=new Scanner(System.in);
		int roll_no=sc.nextInt();
		double marks=sc.nextDouble();
		float marks2=sc.nextFloat();
		System.out.println(roll_no+" "+marks+" "+marks2);
	}
}
