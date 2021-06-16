
import java.util.*;
public class count_character_number_letter
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
char num[]={'1','2','3','5','6','7','8'};//0,1,2
char let[]={'a','b','c','d','e','f','g','h'};
String c1 = "ab12#45";
int ncount=0;
int lcount=0;
int scount=0;
//int i;
char c2[]= c1.toCharArray();
//displaying
for(int j=0;j<=c2.length-1;j++)
{
    System.out.print("\t " + c2[j]);
}


//logic
for(int i=0;i<c2.length;i++)
{
    if(c2[i]==num[i])
    {
        ncount++;
    }
    
    else if(c2[i]==let[i])
    {
       lcount++;
       
    }
    
    else{
        scount++;
    }
    
}
System.out.println( "\t"+"no count :" + ncount + " lcount is " +lcount + " scount " +scount);


	}
}
