package Method;

import java.util.Scanner;

public class Middle_Character {
	
	String middle(String str) {
		int mid;
		int length;
		if(str.length()%2==0) {
			mid=str.length()/2-1;
			length=1;
		}else {
			mid=str.length()/2;
			length=2;
			}
		return str.substring(mid, mid+length);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		Middle_Character mc=new  Middle_Character();
		System.out.println("The Middle Character is : "+ mc.middle(str)); 
	}

}
