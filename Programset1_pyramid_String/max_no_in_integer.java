public class max_no_in_integer
{
	public static void main(String[] args) {
	int	num = 789;
	 int rev= 0;
	 
	while(num>0)
	{
	    rev=rev*10+num%10; //3
	    num =num /10;
	   
	}
	  System.out.println(rev);
	  	String s1 = Integer.toString(rev);
	  	int i = 0;
	  	System.out.println(s1.charAt(i));
	  	char max = s1.charAt(i);
	for(;i<s1.length();i++)
	{
	    
	    if(s1.charAt(i)>max)
	    {
	        max = s1.charAt(i);
	    }
	}
		System.out.println("max is " + max);

	}
}


