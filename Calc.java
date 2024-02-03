package Method;

import java.util.Scanner;

public class Calc {
	int a,b,result;
	void getInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
	}
	int getResult(){
		return a+b;
	}
	public static void main(String[] args) {
		Calc ad=new Calc();
		ad.getInput();
		System.out.println(ad.getResult());	
		
		sub sb=new sub();
		sb.getInput();
		System.out.println(sb.getResult());
		
		mul mu=new mul();
		mu.getInput();
		System.out.println(mu.getResult());
	}

}
class sub{
	int a,b,result;
	void getInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
	}
	int getResult(){
		return a-b;
	}
}

class mul{
	int a,b,result;
	void getInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
	}
	int getResult(){
		return a*b;
	}
}
