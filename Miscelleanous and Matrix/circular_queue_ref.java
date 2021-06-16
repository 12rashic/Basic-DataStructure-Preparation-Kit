public class Main
{
    static void enq(int A[] , int f, int r , int n , int x)
{
    if((r+1)%n==f)
    {
        System.out.println("Stack overflow");
    }
    else
    {
        
        if(r==-1)
        {
            r=0;
            //f++;
            f=0;
        }
        else if(r==n-1)
        {
            r=0;
        }
        else{
            r++;
        }
        A[r]=x;
        System.out.print( "  " + A[r]);
    }
    
}
static void deque(int A[] , int f , int r, int n)
{
    if(f==-1)
    {
        System.out.println("Stack underflow");
    }
    else
    {
        int a = A[f];
        if(f==r)
        {
            f=-1;
            r=-1;
        }
        else if(f==n-1)
        {
            f=0;
        }
        else{
            f++;
        }
        System.out.println( " " + a);
        
    }
    
}
	public static void main(String[] args) {
	    int x = 10 ;
	    int y = 20;
	    int z = 30;
	    int n= 5;
	    int A[]=new int [n];
	    int f = -1;
	    int r = -1;
	    enq(A, f,r,n,x);
	      enq(A, f,r,n,y);
	       enq(A, f,r,n,z);
	    deque(A, f,r,n);
	    
	}
}
