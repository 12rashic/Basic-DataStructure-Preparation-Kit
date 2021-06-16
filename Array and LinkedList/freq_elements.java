
import java.util.*; 
import java.lang.*; 
import java.io.*; 
public class count_of_duplicate
{
	public static void main(String[] args) {
	    	int i;
	int ar[]={10,20,40,60,20,80,20,20};
	Arrays.sort(ar);
    for(i=0;i<=ar.length-1;i++)
        {
   System.out.print("  " + ar[i]);  
        }
	int count =1;

	int k=0;
    int j = k+1;
	for(k=0;k<=ar.length-1;k++)
	{
	        if(ar[k]==ar[j])
	        {
            count=count+1;
System.out.println(  "\n \t"+  ar[k]    + "has repeated for " + count + " times  ");
	            System.out.println("---Time complexity is-- O(2n)");
	            k++;
	        }
	    }
	}   
    
}
