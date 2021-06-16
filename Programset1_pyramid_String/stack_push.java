public class Main
{
	public static void main(String[] args) {
	    int n=7;
	    int a[]=new int[n];
	    //int n = ;
	    //int c= n+1;
	    int top= -1;
	    int x=50;
	    if(top == n-1)
	    {
	        System.out.println("stack overflow");
	    }
	    else
	    {
	        top++;
	        a[top]=x;
	    }
	    /*for(int i=0;i<=n;i++)
	    {
	        System.out.print("  " + a[i]);
	    }
	    */
	    System.out.println(a[top]);
	}
}
