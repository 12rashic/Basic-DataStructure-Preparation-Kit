public class consonant_count
{
	static void totalcons(String s , int cons){
	    		int sz = s.length();
		for(int i=0;i<sz;i++){
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
		  cons++;  
		}
		
		}
		System.out.print(cons);
	}
		
		
		public static void main(String[] args) {
		//System.out.println("Hello World");
		
		String s = "apple";
		int cons=0;
		totalcons(s,cons);
	}}

