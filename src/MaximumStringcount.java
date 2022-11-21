import java.util.Scanner;

public class MaximumStringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word to Maximum occurence of character : ");
		String word= scan.nextLine();
		System.out.println("Method-1");
		System.out.println("----------------------------------------");
		final int n=256;
		boolean flag=false;
	 int	max;//= -1;
	 char result=' ';
		int a[]=new int [256];
		for(int i=0;i<word.length();i++) {
			a[word.charAt(i)]++;
		}
		max = a[word.charAt(0)];
		result=word.charAt(0);
		for(int i=0;i<word.length();i++)
		{
		if(a[word.charAt(i)] > max) {
				max=a[word.charAt(i)];
				result=word.charAt(i);
		}
		
		}	
		if (max==1) {
			System.out.println("Chars in given string are unique..");
		}else {
			System.out.println("Maximum occuring Char is :" +result);
			System.out.println("Number of times the Char occured are :" + max);
		}		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Method-2");
		System.out.println("----------------------------------------");
		char x = ' ',x1 = ' ';
		int   charCnt= 0;
		int   maxCnt= 0;
		for(int i=0;i<word.length();i++) {
			charCnt = 0;
			for (int j =0; j<word.length();j++) {
			     if (word.charAt(j) == word.charAt(i)) {
			    	 x = word.charAt(i);
			    	 charCnt++;
			}
		}
			if (charCnt > maxCnt) {
				x1 = x;
				maxCnt = charCnt;
			}
				
		}
		
		if (maxCnt==1) {
			System.out.println("Chars in given string are unique..");
		}else {
			System.out.println("Maximum occuring Char is :" +x1);
			System.out.println("Number of times the Char occured are :" + maxCnt);
		}		

	}
}
	