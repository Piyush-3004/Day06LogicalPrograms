import java.util.Scanner;
public class FibonacciSeries {
	
	public static void fibSeries(int range) {
		int num1 = 0;
		int num2 = 1;
				
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2;i<range;i++) {
			int sum=num1+num2;
			System.out.println(sum);
			num1=num2;
			num2=sum;			
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements to generate in fibonacci series");
		int count = scanner.nextInt();
		fibSeries(count);
	}
}
