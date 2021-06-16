public class Main
{
    
    
    static void insert(int Q[] , int n , int f , int r,int x)
    {
        if(r==n-1)
        {
            System.out.println("Queue aldready full");
        }
        else
        {
            if(f==-1)
            {
                f++;
                r++;
                Q[r]=x;
                System.out.println(Q[r]);
            }
        }
    }
	public static void main(String[] args) {
	    
	int n= 5; 
int Q[]= new int[n];
int x =12;
int f=0 ;
int r=0;
insert(Q ,n,f,r,x);
	}
}
