import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
	static String removeduplicate(char ch[], int n) {
		int index=0;
		int j;
	     for( int i=0;i<n;i++) {
	    	 for( j=0;j<i;j++) {
	    		 if(ch[i]==ch[j]){
	    			 break;
	    			}
	         }
	    		 if(j==i ){
	    		 ch[index++]=ch[i];
	    		}
	    	}
	     System.out.println("without duplication of word:");
	     return String.valueOf(Arrays.copyOf(ch, index));
	     
	}    
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the word :");
	String str=scan.nextLine();
	char ch[]=str.toCharArray();
	int len=ch.length;
System.out.println(removeduplicate(ch,len));

}	
	
}



