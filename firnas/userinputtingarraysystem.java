import java.util.Scanner;

public class userinputtingarraysystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int []array =new int [10];
		int sum = 0;
		System.out.println("enter the elements :");
		for (int i=0;i<10;i++)
		{
		array[i] =scanner.nextInt();
			
		}
		for(int num : array) {
			sum = sum+num;
			
		}
		System.out.println("sum of array is :"+sum);
	}

}
