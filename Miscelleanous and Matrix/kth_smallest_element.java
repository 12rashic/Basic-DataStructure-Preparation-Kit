public class kth_smallest_element
{
	public static void main(String[] args) {
		
		int k=3;
		int arr[]={7, 10, 4, 3,20,15};
		
		//int i=0;
	    //int min=0;
	    int swaps=0;
	    while(swaps<arr.length){
	   for(int i=0, j=i+1; (i<arr.length && j<arr.length); i++ , j++)
	    {
	        if(arr[i]>arr[j])
	        {
	       int temp = arr[i];
	       arr[i]=arr[j];
	       arr[j]=temp;
	       swaps++;
	        }
	       
	    }
	    }
	    for(int z=0;z<arr.length;z++)
	    {
	        System.out.print(" , " + arr[z]);
	    }
System.out.println("\n \t The kth smallest element is " + arr[k-1]);
		}
}
	

