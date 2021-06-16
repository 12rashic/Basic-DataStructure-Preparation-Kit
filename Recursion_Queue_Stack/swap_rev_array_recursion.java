public class swap_rev_array_recursion
{
		static int revar(int ar[] , int lb, int ub,int temp)
		{
		    
		   if(ub==-1)
		    {
		        return 0;
		    }
		    else
		    {
		        
		        if(lb<ub)
                 temp = ar[lb];
                ar[lb]=ar[ub];
                ar[ub]=temp;
                System.out.println(ar[lb]);
                temp=0;
		    }
		   return revar(ar,lb,ub-1,temp); 
		}
		   public static void main(String[] args) {
		   int ar[]= {10,40,60,80,60}; //0 1 2 3 4
		   int lb  = 0;
            int temp =0;
		   int n   = ar.length;
		   int ub  = n-1;
System.out.println("-------------Tail Recursion----------------------------");

		   revar(ar,lb ,ub,temp);
		    
	}
}
