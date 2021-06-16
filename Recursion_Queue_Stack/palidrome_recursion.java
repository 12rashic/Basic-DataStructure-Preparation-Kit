class palidrome_recursion
{ 
 
static int rev(int n, int temp) 
{ 
    // base case 
    if (n == 0) 
        return temp; 
  
    // stores the reverse 
    // of a number 
    temp = (temp * 10) + (n % 10); 
    n= n / 10;
    return rev(n , temp); 
} 
  

public static void main (String[] args)  
{ 
    int n = 121; 
    int temp = rev(n, 0); 
      
    if (temp == n) 
        System.out.println("it is a palindrome"); 
    else
        System.out.println("it is not a palindrome" ); 
} 
} 