import java.util.Arrays;
import java.util.Scanner;

public class DuplicateString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word to find duplicates");
		String word= scan.nextLine();
		char a[]=word.toCharArray();
		Arrays.sort(a);
		System.out.println(a);
		int len=a.length;
		for(int i=0;i<len;i++) {
			int count=1;
			for(int j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					if(a[i]!=0) {
					count++;
					a[j]=0;
					System.out.println("Duplicates letter are :"+a[i]);
				break;
			    }
				
			     }
		}
		
	}
}
}