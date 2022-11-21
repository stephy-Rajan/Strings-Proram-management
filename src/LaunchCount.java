import java.util.Scanner;

public class LaunchCount {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word :");
		String str=scan.nextLine();
		str=str.replace(" ","").toLowerCase();
		int vcount=0;
		int ccount=0;
		int digit=0;
		int spl=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				 vcount++;
		}
				
		else if(ch>='a' && ch<='z') {
		ccount++;
		}
		else if(ch>='0' && ch<='9') {
			digit++;
		}
		else{
			spl++;
		}
		}
		System.out.println("Total number of vowels:"+vcount);
		System.out.println("Total number of counstants:"+ccount);
		System.out.println("Total number of digit:"+digit);
		System.out.println("Total number of special characters:"+spl);
}
}