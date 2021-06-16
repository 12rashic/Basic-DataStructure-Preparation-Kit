public class even_odd_array
{
	public static void main(String[] args) {
	int arr[] = {1,4,5,10,50,35};
	int even[] = new int[arr.length];
	int odd []= new int[arr.length];
	
    for(int i = 0;i<arr.length;i++)
    {
        if(arr[i]%2==0)
        {
            even[i]=arr[i];
        }
        else{
            odd[i]= arr[i];
            
        }
    }
    for(int y=0;y<odd.length; y++)
    {
        System.out.print("\n \t" + odd[y]);
    }
    
    for(int z=0;z<even.length; z++)
    {
        System.out.print("\n" +even[z]);
    }
	}
}
