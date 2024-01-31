package Method;

import java.util.Scanner;

public class Factorial_recursion {
	int factorial(int k) {
		if(k>=1) {
			return k*factorial(k-1);
		}else {
			return 1;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int k=sc.nextInt();
		Factorial_recursion fr=new Factorial_recursion();
		System.out.println(fr.factorial(k));
	}

}
