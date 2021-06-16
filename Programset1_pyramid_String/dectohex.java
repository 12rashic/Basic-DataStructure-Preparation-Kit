/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class 
{
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 45; 
	        decToHexa(n); 

	}
	
	public static void decToHexa(int n) 
    {    
        char[] hexa = new char[100]; 
      
        int i = 0; 
        while(n!=0) 
        {    
            int temp  = 0;  
            temp = n % 16;
            if(temp < 10) 
            { 
                hexa[i] = (char)(temp + 48); 
                i++; 
            } 
            else
            { 
                hexa[i] = (char)(temp + 55); 
                i++; 
            } 
           
            n = n/16; 
        } 
        for(int j=i-1; j>=0; j--) 
            System.out.print(hexa[j]); 
    }
}

