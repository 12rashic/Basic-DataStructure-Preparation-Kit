public class prime_recursive
{
static int fibr(int num,int i)
{
	if(num<=2)
		{
		    return 1;
		}
		else{
		    if(num%i==0)
		    {
		        return 0;
		        
		    }
		    else{
		        
		        return fibr(num,i-1);
		        //return 0;
		    }
		}
}

                static int res(int a)
		    	{
		    
		    	if(a==1)
		    	{
		    	    System.out.println("it is a prime no");
		    	}
		    	
		    	else{
		    	   System.out.println("not prime no"); 
		    	}
		    	return fibr(num,i-1);
		    	}
		    	
			public static void main(String args[]) {
		    	int num=4;
		    	int i=num;
		    	//fibr(int num,int i);
		    	int a = fibr(int num,int i);
		      res(int a);
		    	
}
}