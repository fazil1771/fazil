package firnas;
import java.util.Scanner;
public class oddoreven2 {
	
	public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number: ");
		int num = reader.nextInt();
		
		if(num%2==0)
			System.out.println(num+"it is even number");
		else
			System.out.println(num+"odd");
	}

}
