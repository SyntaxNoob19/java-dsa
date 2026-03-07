/*
9) Pascal Triangle
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
*/

class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        int i, j;
        for ( i = 1 ; i<=n ; i++)
        {
            for (j = n ; j>=i ; j--)
            {
                System.out.print(" ");
            }
            
            int num = 1;
            for( j = 1; j <= i; j++)
            {
                System.out.print(num + " ");
                num = num * (i - j) / j;
            }
           
            System.out.println();
            
        }
     
         
    }
}
