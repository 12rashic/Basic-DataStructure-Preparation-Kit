/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class fib_fun
{
    public static void main(String[] args) {
		int a=0,b=1,max=10;
		fibonacci(a,b,max);
	}
	
	public static int fibonacci(int a,int b,int max) {
		int sum;
		for(int i=0;i<=max;i++) {
			System.out.println(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
		return a;
	}
}

