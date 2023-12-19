package intuit;

public class                                                         MatrixSpirit {

    public static int[] snail(int[][] a) {
        int j=0;
        int i;
        int k=0; //starting row index
        int l=0; //starting column index
        int m=a.length;//ending row index
        int n= a[0].length; //ending column index
        int[] result = new int[m*n];
        while(k < m && l < n) {
            //print the first row from the remaining row
            for(i=l; i < n; i++) {
                result[j] = (a[k][i]);
                j++;
                System.out.print(a[k][i] + " ");
            }
            k++;
            //print the last column from the remaining column
            for(i = k; i < m; i++) {
                result[j] = (a[i][n-1]);
                j++;
                System.out.print(a[i][n-1] + " ");
            }
            n--;
            //print the last row
            if(k < m) {
                for (i = n - 1; i >= l; i--) {
                    result[j] = (a[m - 1][i]);
                    j++;
                    System.out.print(a[m - 1][i] + " ");
                }
                m--; // decrease row from last by 1
            }
            //print the first colum
            if(l < n) {
                for (i = m-1; i>=k; i--) {
                    result[j] = (a[i][l]);
                    j++;
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
        return result;
    }

    static void spiralPrint(int m, int n, int a[][]) {
        int i, r = 0, c = 0;
     /* r - starting row index
        m - ending row index
        c - starting column index
        n - ending column index
        i - iterator
        */

        while (r < m && c < n) {
            // Print the first row from the remaining rows
            for (i = c; i < n; ++i) {
                System.out.print(a[r][i] + " ");
            }
            r++; //increase row

            // Print the last column from the remaining columns
            for (i = r; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--; // decrease column from last by 1

            // Print the last row from the remaining rows */
            if (r < m) {
                for (i = n - 1; i >= c; i--) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }

            // Print the first column from the remaining columns */
            if (c < n) {
                for (i = m - 1; i >= r; i--) {
                    System.out.print(a[i][c] + " ");
                }
                c++;
            }
        }
    }

    // driver program
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 },
                { 19, 20, 21, 22, 23, 24 },
                { 25, 26, 27, 28, 29, 30 } };
        int R = a.length;
        int C = a[0].length;
        spiralPrint(R, C, a);
        System.out.println("");
        int[] snail = snail(a);
    }
}
