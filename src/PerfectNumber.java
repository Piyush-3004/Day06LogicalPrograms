import java.util.Scanner;

public class PerfectNumber {

	
	public static boolean isPerfectNumber(int number) {
		boolean checkIfPerfect=false;
		int sum=0;
		for(int x=1;x<=number/2;x++) {
			if(number%x==0) 
				sum=sum+x;
			if(number == sum )
				checkIfPerfect= true;
		}
		
		return checkIfPerfect;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to check if Perfect or not");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		boolean checkIfPerfect = isPerfectNumber(num);
		if(checkIfPerfect==true)
			System.out.println(num+" Is Perfect Number");
		else
			System.out.println(num+" Is not Perfect NUmber");
	}

}
