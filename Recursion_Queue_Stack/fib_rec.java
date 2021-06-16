public class fib_rec
{
    static int a , b, c1;
		//System.out.println("Hello World");
		static void fib(int n)
		{
		    if(n>0)
		    {
		        c1=a+b;
		        a=b;
		        b=c1;
		        System.out.println(" " + c1);
		      return fib(n-1);

		        
		    }
		}
		public static void main(String[] args) {
		    
		    fib(10);
		    int r= fib(10);
		    System.out.println(r);
		    
		
	}
}
