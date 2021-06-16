public class replace_charater
{
	public static void main(String[] args) {
		
		String s1= "helloworld";
		//int i=0;
		//int j=0;
	
		int n= s1.length();
		char c1[]= new char[n];
		for(int k=0;k<n;k++)
		{
		    c1[k]=s1.charAt(k);
		}
		
		char c2[]= new char[n];
		//ite3rating throught the array
		for(int i=0;i<n;i++)
		{
		     c2[i]=c1[i];
		     if(c1[i]=='l')
		     {
		        c2[i]='T'; 
		     }
		}
		//c1[i]='\0';
		//c2[i]='\0';

		
for(int l=0;l<n;l++)
{
    //System.out.print( c2[l]);//copied to c2

}
String s2= new String(c2);
System.out.println(s2);

 
	}
}

