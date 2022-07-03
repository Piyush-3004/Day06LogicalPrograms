import java.util.Scanner;
public class ReverseNumber {

	public static int getReverse(int number) {
		int temp =number;
		int reverse = 0;
		for(;temp!=0;temp=temp/10) {
			int digit = temp%10;
			reverse = reverse*10+digit;
		}
		return reverse;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to get its reverse number");
		int number = scanner.nextInt();
		System.out.println("reverse of "+number+" is "+getReverse(number));

	}

}
