public class GOOD_BAD_STRING
{
	public static void main(String[] args) {
		int count =0;
		int cons=0;
		String s = "aeoiupl";
		int sz= s.length();
		char c= new char[sz];
		for(int i=0;i<sz;i++)
		{
		    if(c[i]=='a'||'e'||'o'||'i'||'u')
		    {
		     count ++ ;  
		    }
		    
		    else if(c[i]=='p'||'l'||'k'||'z'||'m')
		    {
		        cons++;
		    }
		    
		}
		
		
		if(count>=3||cons>=5)
		{
		    System.out.println("BAD STRING");
		    
		}
		else{
		    System.out.println("GOOD STRING");
		    
		}
	}
}
