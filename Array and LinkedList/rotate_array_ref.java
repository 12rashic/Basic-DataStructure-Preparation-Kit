public class rotate_array_ref
{
	public static void main(String[] args) {
	    int ar[]= {1,4,5,7,3,5,9};
		int sz=ar.length;
		System.out.println("------------------------------");
		int r=2;
		int k=sz-r;
		System.out.println("two arrays are  0 to  " + k + "  and  remaining elements is second array");
		int i=0;
		int j= k-1;
		while(i<=j)
		{
		    int temp= ar[i];
		    ar[i]=ar[j];
		    ar[j]=temp;
		    i++;
		    j--;
		}
		for(int l=0;l<=ar[k];l++){
		System.out.print(ar[l]);
		}
	}
}
