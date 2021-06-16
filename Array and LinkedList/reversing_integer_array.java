public class reversing_integer_array
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int ar[]={2,4,5,7,8};
		int i=0;
		int j=ar.length-1;
		int swaps=0;
		while(i<j){
		    
	        int temp= ar[i];
	        ar[i]=ar[j];
	        ar[j]=temp;
	        //swaps++;
	        i++;
	        j--;
	    
		}
		for(int l=0;l<=ar.length-1;l++){
		System.out.print(" "  + ar[l]);
		}
	}
}
