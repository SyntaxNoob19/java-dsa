/*
7)Hollow Full Pyramid Star
    *
   * *
  *   *
 *     *
* * * * *
*/
class HollowFullPyramid {
    public static void main(String[] args) {
        int n = 5;
        int i, j;
        for ( i = 1 ; i<=n-1 ; i++)
        {
            for (j = n-1 ; j>=i ; j--)
            {
                System.out.print(" ");
            }
            
            for (j = 1 ; j<=i; j++)
            {
                if(j==1 ||  j==i)
                System.out.print("* ");
                else 
                System.out.print("  ");
            }
           
            System.out.println();
            
        }
     
          for (j = 1 ; j<=n ; j++)
            {
                System.out.print("* ");
            }
    }
}
