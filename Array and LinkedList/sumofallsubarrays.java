public class Main
{
	public static void main(String[] args) {
		int a[] = {1,2,3};
		int n = a.length;
				            int sum=0;

		for(int i = 0;i<n;i++)
		{
		    for(int j=i;j<n;j++)
		    {
		        for(int k=i;k<=j;k++)
		        {
		            //System.out.print(  a[k] );
		            sum = sum + a[k];
		            
		        }
		      
		    }
		    System.out.println();
		}
				    System.out.print(sum);

	}
}
//
if ques is --> print sum of all subarrays starting from i (eg= {1} , {1,2},{1,2,3}) put the print statement in outermost loop