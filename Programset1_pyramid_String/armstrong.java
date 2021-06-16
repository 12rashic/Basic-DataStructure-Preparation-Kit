public class armstrong
{
	public static void main(String[] args) {
		int num= 153;
		armstrongNum(num);
	}
	
	public static void armstrongNum(int num) {
		int a;
		int temp=num;
		int digits=0;
		double sum=0;
		while(temp!=0){
			digits++;
			temp=temp/10;
		}
		temp= num;
		while(temp!=0) {
			a=temp%10;
			sum= sum + Math.pow(a, digits);
			temp= temp/10;
		}
		if(num==sum) {
			System.out.println(num+" is an Armstrong number");
		}
		else {
			System.out.println(num+" is not an Armstrong number");
		}
	}
}

