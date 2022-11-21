import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word :");
		String str=scan.nextLine();
		str=str.replace(" ","");
		str=str.toUpperCase();
		char ch1[]=str.toCharArray();
		int[] ar=new int[26];
		for(int i=0;i<ch1.length;i++)
		{
		int index=ch1[i]-65;
		ar[index]++;
		}
		for(int i=0;i<ar.length;i++) {
		if(ar[i]==0) {
			System.out.println("word is not a  pangram");
			flag=true;
			break;
		}
		}
	
		if(flag==false)
		{
			System.out.println("word is  a  pangram ");
		}
		}
}

