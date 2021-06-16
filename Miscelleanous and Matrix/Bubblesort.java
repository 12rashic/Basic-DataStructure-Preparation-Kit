

public class Main
{
	public static void main(String[] args) {
	    int a[]={1,5,9,2,6,3};
	    int n = a.length;
	    for(int i=0; i<n-1 ; i++)
	    {
	        for(int j = i+1; j<n; j++)
	        {
	            if(a[i]>a[j])
	            {
	            int  temp = a[i];
	            a[i]=a[j];
	            a[j]=temp;
	            }
	        }
	   }
	    for(int k =0 ; k<n; k++)
	    {
	        System.out.print(" " + a[k]);
	    }
	}
}
