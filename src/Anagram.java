import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static char[] lowercase1(char ch1[],int len) {
		String s="";
	int index=0;
	int temp=0;
		for(int i=0;i<len;i++)
		{
			
		if(ch1[i]>='A' && ch1[i]<='Z') {
			ch1[i] = (char) ((int)ch1[i] + 32);
		} 
		}
		for(int i=0;i<len;i++) {
		for(int j=i+1;j<len;j++)
		if(ch1[i]>ch1[j])
		{
			temp=ch1[i];
			ch1[i]=ch1[j];
		ch1[j]=(char) temp; 
		}
		}
		
		System.out.print("sorted array of first word:");
		System.out.println(ch1);
		return ch1;
	}	
	public static char[] lowercase2(char ch2[],int len) {
		String s="";
	int index=0;
	int temp=0;
		for(int i=0;i<len;i++)
		{
			
		if(ch2[i]>='A' && ch2[i]<='Z') {
			ch2[i] = (char) ((int)ch2[i] + 32);
			System.out.println(ch2[i]);
		} 
		}
		for(int i=0;i<len;i++) {
		for(int j=i+1;j<len;j++)
		if(ch2[i]>ch2[j])
		{
			temp=ch2[i];
			ch2[i]=ch2[j];
		ch2[j]=(char) temp;
		}
		}
		
		System.out.print("sorted array of second word:");
		System.out.println(ch2);
		return ch2;
	}	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first word :");
		String str1=scan.nextLine();
		char ch1[]=str1.toCharArray();
		int n1=str1.length();
		System.out.println("Enter the second word :");
		String str2=scan.nextLine();
		char ch2[]=str2.toCharArray();
		int n2=str2.length();
		System.out.println("Ch1 Array:"+ch1[0]+ch1[1]+ch1[2]);
		System.out.println("Ch1 Length:"+n1);
		lowercase1(ch1,n1);
		lowercase2(ch2,n2);
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Given strings are Anagram");
		}
		else {
			System.out.println("Given strings are not Anagram");
		}
		}
	}
