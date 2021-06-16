public class Count_of_only_alphabets
{
	public static void main(String[] args) {
		
		String s1= "#%*hello23";
		int i;
		for(i=0;i<s1.length()-1;i++)
		{
		 if(s1.charAt(i)>='a'&&s1.charAt(i)<='z' ||s1.charAt(i)>='A'||s1.charAt(i)>='Z')   
		    {
		        System.out.print(s1.charAt(i));
		    }
		}

	}
}
