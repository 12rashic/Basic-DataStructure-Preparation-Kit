import java.util.Scanner;
public class even_next_round
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int ar1[]= new int[5];
System.out.println("Enter the array elements");
for(int i=0;i<5;i++)
{
    ar1[i]=sc.nextInt();
    System.out.println("Array elemenst are" + ar1[i]);
}
System.out.println("Enter the Kth elements");
int k = sc.nextInt();
while(k<=5)
{
    for(int i=0;i<5;i++)
    {
        if(ar1[i]>=k)
        {
            
            System.out.println( ar1[i]);
            i++;
        }
    }
}

	}
}

