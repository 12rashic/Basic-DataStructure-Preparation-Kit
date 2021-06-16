public class Reverse_int_recursion
{
		static int rev(int n)
		{
		    int temp=0;

		    if(n==0)
		    {
		        return 0;
		    }
		    else{
		        if(n>0){
		        temp = (temp * 10) + (n % 10); 
                n= n / 10; 
		            }
		        System.out.print(temp);
		    }
		    
		  return rev(n);
		
		}



		
public static void main(String[] args) {
			    int n= 155;
			    rev(n);
			    
			    
		
	}
}
