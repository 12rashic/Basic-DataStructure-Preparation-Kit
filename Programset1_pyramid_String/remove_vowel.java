

public class remove_vowel
{
    public static void main(String[] args) {
     String s = "welcomehome";
   int sz=s.length(); //use as sz-1
   int i=0;
    char ar[]= new char[sz];
    
        while(s.charAt(i)!='\0')
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                ar[i]=s.charAt(i);
                i++;
                //charRemoveAt(s ,i);
                //System.out.println();
            }
           
        }
 
 for(int k=0;k<sz-1;k++){
		System.out.println(" \t" + ar[k]);
 }
	}
}