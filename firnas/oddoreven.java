import java.util.Scanner;
public class oddoreven{
	public static void main(String[] args) {
		// odd or even program
		int num;
		System.out.println("enter a integer number :");
			Scanner input = new Scanner(System.in);
			num =  input.nextInt();
			if(num % 2 == 0)
				System.out.println("it is a even number  ");                       
			else
				System.out.println("it is a odd number");
			
		

	}

}
