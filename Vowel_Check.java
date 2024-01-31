package Method;

import java.util.Scanner;

public class Vowel_Check {
	
	int vowel_count(String str) {
		int count=0;
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
			if(str.charAt(i) =='A' || str.charAt(i) =='E' || str.charAt(i) =='I' || str.charAt(i) =='O' || str.charAt(i) =='U'){	
			count++;
			}
	}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		Vowel_Check vc=new Vowel_Check();
		String str=sc.next();
		System.out.println("The count of vowel is : " + vc.vowel_count(str));
	}

}
