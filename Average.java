package Method;

import java.util.Scanner;

public class Average {
	
	int avg(int x,int y,int z) {
		
		return (x+y+z)/3;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X :");
		int x=sc.nextInt();
		System.out.println("Enter the value of Y :");
		int y=sc.nextInt();
		System.out.println("Enter the value of Z :");
		int z=sc.nextInt();
		Average av=new Average();
		System.out.println("The Average value is : " + av.avg(x, y, z));
	}

}
