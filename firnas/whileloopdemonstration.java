import java.util.Scanner;
public class whileloopdemonstration {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("n enter any integer below 10:");
		number =sc.nextInt();
		
		while (number <=10) {
			sum =sum + number;
			number++;
		}
		System.out.format("sum of the number from the while loop is :%d",sum);	
		}
	}


