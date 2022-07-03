import java.util.Scanner;

public class LogicalProgramsAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		int num = 0;
		int num2 = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of elements to create in fibonacci series");
		
		int count = scanner.nextInt();
		System.out.println(num);
		System.out.println(num2);
		for(int i=2;i<count;i++) {
			int sum=num+num2;
			System.out.println(sum);
			num=num2;
			num2=sum;			
		}
		
		
		
		System.out.println("######################  Assignment 2 Perfect number ###################");
		
		int number= 28;
		int sum=0;
		System.out.println("Factors are : ");
		for(int x=1;x<=number/2;x++) {
			if(number%x==0) {
				sum=sum+x;
				System.out.print(x);}
		}
		
		System.out.println("sum of factors is : "+sum);
		if(number == sum )
			System.out.println(number+"Is perfect number");
		else
			System.out.println(number+" is Not Perfect number");
	
	
		System.out.println("######################  Assignment 3 Prime number ###################");
	
		int primeNumber = 69;
		boolean isPrime= true;
		for(int i=2;i*i<primeNumber;i++) {
			if( primeNumber %i ==0) {
				isPrime=false;
				break;}
		}
		if(isPrime==true)
			System.out.println(primeNumber+" is Prime Number");
		else
			System.out.println(primeNumber+" is not Prime Nuber");
	
	 */
	
		System.out.println("######################  Assignment 4 Reverse number ###################");
		int number = 155100245;
		int temp =number;
		int reverse = 0;
		for(;temp!=0;temp=temp/10) {
			int digit = temp%10;
			reverse = reverse*10+digit;
		}
	System.out.println("reverse of "+number+" is "+reverse);
	
	}

}
