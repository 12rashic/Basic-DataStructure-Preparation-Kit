/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class menudriven
{
	public static void main(String[] args) {
		int a=7;
		factCal(a);
		prime(a);
		oddEven(a);

	}
	
	public static int factCal(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+a+" is "+fact);
		return fact;
	}
	
	public static void prime(int a) {
		int m= a/2;
		int flag=0;
		
		if(a==0 || a==1) {
			System.out.println(a+ " is Not a prime number");
		}
		else {
			for(int i=2;i<=m;i++) {
				if(a%2==0) {
					System.out.println(a+" is Not a prime number");
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println(a+" is a Prime Number");
		}
	}
	
	public static void oddEven(int a) {
		if(a%2==0) {
			System.out.println(a+" is an even number");
		}
		else {
			System.out.println(a+" is an odd number");
		}
	}
}

