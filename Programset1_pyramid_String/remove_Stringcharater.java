public class remove_Stringcharater
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		String s1 = "pHello";
		int n = s1.length();
		  char c1[] = new char[n];
		  char c2[] = new char[n];
		for(int i =0 ;i<n;i++)
		{
		  c1[i]= s1.charAt(i);
		}
		for(int i=0;i<n; )
		{
		    for(int j= 0;j<n;)
		    {
		    if(c1[i]!='l')
		    {
		        //c1[i] = '0';
		        //c1[i]--;
                c2[j]=c1[i];
            }
            i++;
            j++;
		    }
		}

		for(int l=0;l<n;l++)
		{
		    System.out.println(c2[l]);
		}
	}
}
