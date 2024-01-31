package Method;

import java.util.Scanner;

public class Wordcount {
	
	int wordcount(String str) {
		int count = 1;
		for(int i = 0; i<str.length();i++) 
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) 
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		Wordcount wc=new Wordcount();
		System.out.println("The number of word in string is : "+ wc.wordcount(str));
	}

}

