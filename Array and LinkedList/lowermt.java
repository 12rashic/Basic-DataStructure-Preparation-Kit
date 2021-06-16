class lowermt
{ 
    static void lmt(int matrix[][],  
                      int r, int c) 
    { 
        int i, j; 
        for (i = 0; i < r; i++) 
        { 
            for (j = 0; j < c; j++) 
            { 
                if (i < j) 
                { 
                    System.out.print("0" + " "); 
                } 
                else
                System.out.print(matrix[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 
      
    
    public static void main(String args[]) 
    { 
         int r= 3, c= 3;
        int matrix[][] = {{2, 5, 9},  
                          {6, 2, 1},  
                          {1, 0, 5}}; 
        
          
        System.out.println("Lower triangular "); 
        lmt(matrix, r, c); 
          
        
    } 
} 
