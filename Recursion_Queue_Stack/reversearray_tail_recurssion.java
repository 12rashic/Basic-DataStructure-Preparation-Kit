public class reversearray_tail_recurssion
{
		static int revar(int ar[] , int lb, int ub)
		{
		    if(ub==-1)
		    {
		        return 0;
		    }
		    else
		    {
		        if(ub>=0)
		   		System.out.print("\t " +ar[ub]);
		   		
		    }
		   return revar(ar,lb,ub-1); 
		}
		   public static void main(String[] args) {
		   int ar[]= {10,40,60,80,60}; //0 1 2 3 4
		   int lb  = 0;
		   int n   = ar.length;
		   int ub  = n-1;
		   	System.out.println("-------------Tail Recursion----------------------------");

		   revar(ar,lb ,ub);
		    
	}
}
