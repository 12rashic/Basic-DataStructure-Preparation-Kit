public class Intersection_of_array_elem
{
	static void intersection_array(int a1[] , int b2[] )
{
for(int i=0;i<=a1.length-1;i++)

{
    for(int j = 0;j<=b2.length-1;j++)
    {
        if(a1[i]==b2[j])
        {
         System.out.print("  "  + b2[j]  ); 

        }
        //i++;
        //j++;
    }
    //i++;
    
}
//return b2[j];
}

public static void main(String[] args) {
int a1[] = {1 ,6, 7,8};
int b2[] ={ 6,8,9,10};
//int j = 0;
System.out.print("Intersection elements are  ::");
intersection_array(a1 , b2);
	}
}
