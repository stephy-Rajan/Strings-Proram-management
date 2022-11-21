import java.util.Scanner;

public class Palindrome {
	
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number;");
	int num=scan.nextInt();
	int org=num;
	int rev=0;
	while(num!=0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}
	if(org==rev)
	{
		System.out.println("Number " +org  +" is a palindrome");
	}
	else
	{
		System.out.println("Number " +org  +" is not  a palindrome");
    }
}
}