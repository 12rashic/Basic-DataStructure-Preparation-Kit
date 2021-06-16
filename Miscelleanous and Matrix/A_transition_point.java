public class Main
{
    static int trap(int a[],int low,int high)
    {
        	    while(low<high)
        	    {
        	           	    int mid= (low+high)/2;
        	           	    if(a[mid]==1 && (mid==0 || a[mid]-1==0))
        	           	    {
        	           	        return mid;
        	           	    }
        	           	    else if(a[mid]-1==1)
        	           	    {
        	           	        high= mid-1;
        	           	        trap(a ,low,high);
        	           	    }
        	           	    else
        	           	    {
        	           	        low=mid+1;
        	           	         trap(a,low,high);
        	           	    }
        	    }
        	           	    return -1;
    }
	public static void main(String[] args) {
	    int a[]={0,0,1,1,1,1};
	    int high = a.length-1;
	    int low = 0;
	    System.out.println("The transition point is :" + trap(a ,low,high));
	}
}
