

public class dec_to_bin
{
	public static void main(String[] args) {
	    int num= 6;
	    int ba[]=new int[4];
	    int i=0;
	    while(num>0)
	    {
	      ba[i]=num%2;
	      num=num/2;
	       i++;
	       System.out.print("\n");
	      System.out.print(ba[i]);
	    }
	    int l= ba.length;
	    //System.out.println(l);
	   for(int j = i-1;j>=0;j--)
	    {
	        System.out.println("\n");
	        System.out.print(ba[j]);
	    }
	    
	}
	
}
