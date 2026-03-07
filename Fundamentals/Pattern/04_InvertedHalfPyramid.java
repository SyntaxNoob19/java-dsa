/*
4) Inverted Half pyramid
* * * * * *
* * * * *
* * * *
* * *
* *
*
*/

//Outer loop → rows
//Inner loop → stars in that row

/*
Row 1 → 5 stars
Row 2 → 4 stars
Row 3 → 3 stars
Row 4 → 2 stars
Row 5 → 1 star
*/

class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        int i, j;
        for ( i = 1 ; i<=n ; i++)
        {
            for (j = n ; j>=i ; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
