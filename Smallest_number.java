package Method;

import java.util.Scanner;

public class Smallest_number {
	
	int smallest(int num1,int num2,int num3) {
		if(num1<num2 && num1<num3) {
			System.out.println("Num1 is Smallest : " + num1);
			
		}
		else if(num2<num1 && num2<num3) {
			System.out.println("Num2 is Smallest : " + num2);
			
			}else {
				System.out.println("Num3 is Smallest : " + num3);
			}
		return 0;
	}

	public static void main(String[] args) {
		Smallest_number sn=new Smallest_number();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the Second number:");
		int num2=sc.nextInt();
		System.out.println("Enter the Third number:");
		int num3=sc.nextInt();
		sn.smallest(num1, num2, num3);
		
	}

}
