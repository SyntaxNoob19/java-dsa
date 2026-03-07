/*
2) Hollow Rectangular star
* * * * *
*       *
* * * * *
*/

class HollowRectangular {
    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        int i, j;
        for ( i = 1 ; i<=n ; i++)
        {
            for (j = 1 ; j<=m ; j++)
            {
                if( i==1 || i==n || j==1 || j==m)
                System.out.print("* ");
                
                else
                System.out.print("  ");
            }
            
            System.out.println();
        }
        
    }
}
