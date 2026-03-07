/
6) Inverted Full pyramid
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
*/

class InvertedFullPyramid {
    public static void main(String[] args) {
        int n = 6;
        int i, j;
        for ( i = 1 ; i<=n ; i++)
        {
            for (j = 1 ; j<=i-1 ; j++)
            {
                System.out.print(" ");
            }
            for (j = n ; j>=i ; j--)
            {
                System.out.print("* ");
            }
            
            
            System.out.println();
        }
        
    }
}
