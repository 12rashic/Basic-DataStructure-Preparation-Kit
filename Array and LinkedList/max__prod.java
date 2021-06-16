public class max__prod
{
	public static void main(String[] args) {
		int ar[]={1,2,3,4};
		     int count[]=new int[ar.length-1];
		     //iterating through the array
		for(int i=0;i<ar.length-1;i++)
		{
		      for(int j =1;j<ar.length-1;j++)
		      {
		          for(int k=0;k<ar.length-1;)
		        {
		        count[k] = (ar[i] * ar[j]);
		       // System.out.println(count[k]);
		        //i++;
		        //j++;
		        k++;
		    }
		      }
		}
		
		for(int x=0;x<=count.length-1;x++)
		{
		    System.out.print(" " + count[x]);
		}
		
	}
}

