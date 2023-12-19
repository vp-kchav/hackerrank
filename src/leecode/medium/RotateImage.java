package leecode.medium;

public class RotateImage {
    public static int[][] rotate(int [][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0; i<arr.length; i++) {
            int lastCol = arr[0].length-1;
            for(int j=0; j<=lastCol/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][lastCol-j];
                arr[i][lastCol-j] = temp;
            }
        }

        return arr;
    }

    public static void main(String []arg) {
        int [][]arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int [][]arr1 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(arr1);
    }
}
