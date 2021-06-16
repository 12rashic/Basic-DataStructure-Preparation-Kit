public class minmaxfun
{
	
	 static void minmax(int num , int rev)
	 {
	while(num>0)
	{
	    rev=rev*10+num%10; //3
	    num =num /10;
	   
	}
	  System.out.println(rev);
	  	String s1 = Integer.toString(rev);
	  	int i = 0;
	  	
	  //	System.out.println(s1.charAt(i));
	  	char max = s1.charAt(i);
	for(;i<s1.length();i++)
	{
	    
	    if(s1.charAt(i)>max)
	    {
	        max = s1.charAt(i);
	    }
	    
	    
	}
		System.out.println("max is " + max);
	
		
		//min
		int k = 0;
		char min = s1.charAt(k);
		for(;k<s1.length();k++)
	{
	    if(s1.charAt(k)<min)
	    {
	        min = s1.charAt(k);
	    }
	}
		System.out.println("min is " + min);
		

for(int z=2;z<=9;z++)
{
    System.out.println(s1.charAt(z));
}
}

public static void main(String[] args) {
	int	num = 75629;
	 int rev= 0;
	 minmax(num,rev);
	 
	}
}


