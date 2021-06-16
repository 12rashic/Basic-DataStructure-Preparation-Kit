public class Main
{
	public static void main(String[] args) {
	int ar[]={10,20,40,60,20,80};
	
	int temp[] = new int[ar.length];
	int k= 0;
	for(int i=0;i<ar.length-1;i++)
	{
	    for(int j=i+1;j<ar.length-1;j++)
	    {
	        if(ar[i]!=ar[j])
	        {
	            temp[k++]=ar[i];
	        }
	        i++;
	    }
	    temp[k++]=ar[ar.length-1];
    }
    for(int i=0;i<k;i++)
    {
        ar[i]=temp[i];
        System.out.println(ar[i]);
    }
}
}