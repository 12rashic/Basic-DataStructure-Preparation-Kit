
public class smallest_array_element
{
	public static void main(String[] args) {
		int ar1[]={1,7,3,4,5};
		int max=ar1[0];
		for(int i=0;i<ar1.length;i++)
		{
		    if(ar1[i]>max)
		    {
		        max = ar1[i];
		    }
		}
		    System.out.print(max);
		
	}
}
