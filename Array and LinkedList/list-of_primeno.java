public class prime_list_function
{
		static void primelist(int no, int temp)
		{
		for(int i=1;i<no;i++)
		{
		    for(int j =2;j<i-1;j++)
		    {
		        if(i%j==0)
		        {
		            temp= temp+1;
		            
		        }
		        
		    }
		    if(temp==0)
		{
		   // System.out.println()
		  System.out.println(i+"yes");  
		}
		else
		{
		    temp = 0;
		  //System.out.print( i+"no");  
  
		}
		}
		}
		
	public static void main(String[] args) {
	   int no= 80;
		int temp =0; 
		int i;
		primelist(no,temp);

		
	}
}
