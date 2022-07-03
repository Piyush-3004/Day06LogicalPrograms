import java.util.Scanner;
public class PrimeNumber {
	
	
	public static boolean isPrime(int num) {
	
		boolean isP= true;
		for(int i=2;i*i<num;i++) {
			if( num %i ==0) {
				isP=false;
				break;
				}
			
		}
		return isP;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check if it is prime or not");
		int number = scanner.nextInt();
		boolean check = isPrime(number);
		if(check==true)
			System.out.println(number+" is Prime Number");
		else
			System.out.println(number+" is not Prime Nuber");
	}

}
