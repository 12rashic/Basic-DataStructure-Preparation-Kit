
public class Nontail_recursive_arrayrevrse
{
    	  static   int c1=4;

	static void f1(int arr[] , int e)

{		

if(e == -1)
{
    return ;
}
else{
    if(e>=0)
    System.out.println("\t " + arr[e]);
}
 f1(arr , e-1);
 System.out.println("statement returning , its non-tail" + c1--);
 //c1++;


	}
	
	
	public static void main(String[] args) {
	    
	    int arr[]={10,40,30,90,70};
	   int e = 4;

	    f1(arr , e);
}
}