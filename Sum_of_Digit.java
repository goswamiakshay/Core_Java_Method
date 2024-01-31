package Method;

import java.util.Scanner;

public class Sum_of_Digit {
	
	int SumDigit(int num) {
		
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
		}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit : ");
		int digit=sc.nextInt();
		Sum_of_Digit sd=new Sum_of_Digit();
		
		System.out.println("The sum of digit : " +  sd.SumDigit(digit));
		

	}

}
