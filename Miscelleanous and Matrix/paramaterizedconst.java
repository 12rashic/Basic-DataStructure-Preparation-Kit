public class Main
{
    static int fd(int m , int b , int count)
    {
	        if(m==b)
	        {
	             count++;
	        }
	        else
	        if(b<m)
	        {
	            b++;
	            count++;
	            fd(m , b , count);
	        }
	        else
	        {
	            b--;
	            count++;
	           fd(m , b, count);
	        }
	        return count;
    }
	public static void main(String[] args) {
	    int m =-1;
	    int b =4 ;
	    int count=0;
	   fd(m ,b , count);

	}
}
