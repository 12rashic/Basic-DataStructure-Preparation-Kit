import java.util.Arrays;
public class string_multiplication
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		String s1[]= {"22", "32"};
		String s2[] = {"11" ,"1"};
		int n= 2;
		//int i=0;
		int [] c1 = new int [n];
		int [] c2 = new int [n];
		
		for(int y=0;y<n;y++)
		{
		    //int c1[]=s1.charAt(y);
		    c1[y] = Integer.parseInt(s1[y]);
		}
		for(int z=0;z<n;z++)
		{
		    //int c2[]=s2.charAt(z);
		     c2[z] = Integer.parseInt(s2[z]);
		}
		
		//int c1[]=Arrays.toString(c1);
		//int c2[]=Arrays.toString(c2);
		int c3[] = new int [2];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        c3[i]=c1[i]*c2[j];
		    }
		}
		for(int l=0;l<n;l++)
		{
		System.out.println(c3[l]);
		}
	}
}
