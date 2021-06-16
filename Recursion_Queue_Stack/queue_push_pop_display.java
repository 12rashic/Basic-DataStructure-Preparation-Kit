

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
                //r++;
                
            }
            r++;
            Q[r]=x;
                System.out.println(Q[r]);
        }
    }
    static void display(int Q[] , int n )
    {
        for(int k=0;k<n;k++)
        {
            System.out.print(Q[k]);
        }
    }
    static void pop(int Q[] ,int n,int f,int r )
    {
        int y;
        if(f==-1)
        {
            System.out.println("underflow");
        }
        y = Q[f];
        
            if(f==r)
            {
                f=r=-1;
            }
            else{
            f++;
            }
            System.out.println("\t " +y);
        
    }
	public static void main(String[] args) {
	    
	int n = 5; 
int Q[]= new int[n];
int x ;
int f=-1 ;
int r=-1;
//int y;
//insert(Q ,n,f,r,1);
//insert(Q ,n,f,r,2);
insert(Q ,n,f,r,4);
r++;
insert(Q ,n,f,r,3);
System.out.println("Elements of queue are");
//display(Q ,n);
display(Q ,n);

f++;
pop(Q ,n,f,r);


	}
}



