/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class bintodec
{
	public static void main(String[] args) {
		int num =11111111;
		toDecimal(num);

	}
	
	public static int toDecimal(int num) {
		int binVal;
		int decVal=0,base=1;
		binVal=num;
		while(num>0) {
			int remainder= num%10;
			decVal= decVal+ remainder*base;
			num=num/10;
			base= base*2;
		}
		System.out.println(binVal+"="+decVal);
		return decVal;
	}
}

