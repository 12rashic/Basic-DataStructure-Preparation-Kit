import java.util.*;
public class Reversearray_recurssion_using_ArrayList
{

  static int al(int k2)
  {
      //Base Condition
if(k2==-1)
{
    return 0;
}
//
else{
    if(k2>=0)
    System.out.println(" \t " + k2--);

    }
 return al(k2--);
  }
/*for(int i=0;i<a1.size();i++)
{
    System.out.print(" \t" + a1.get(i));
}
*/

  public static void main (String[]args)
  {
ArrayList<Integer> a1 = new ArrayList<Integer>();
a1.add(1);
a1.add(2);
a1.add(3);
a1.add(4);  
//int k1= 0;
int k2 = 3;
System.out.println("      Implementing Tail Recursion    ");

al( k2);

  }
}
