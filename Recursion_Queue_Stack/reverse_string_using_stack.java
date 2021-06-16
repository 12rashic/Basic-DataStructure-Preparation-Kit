public class Main
{
    
    static void push(char  A[] , int top ,char x, int n )
    {
        if(top==n-1)
        {
            System.out.println("Stack overflow");
        }
        else{
            top++;
            A[top]=x;
            System.out.print(" " + A[top]);
        }
    }
    static char pop(char A[] , int top  )
    { 
       if(top ==-1)
       {
           return 0;
       }
       else{
           System.out.print(A[top]+" ");
           return pop(A , top-1);
       }
        
    }
    

	public static void main(String[] args) {
	    char  A[]={'r' , 'a' , 's' ,'h' ,'i'}; 
	    int n = A.length;
	    int top = -1;
	    
	    ///System.out.println()
	    //impl(A , top  , n);
	    for(int i = 0;i<n;i++)
        {
        push(A , top , A[i], n); 
        top++;
        }
	    System.out.println();
	   pop(A,n-1);

	   
	}
}





