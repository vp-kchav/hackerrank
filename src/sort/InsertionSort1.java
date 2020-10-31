/*
 * Created on Apr 14, 2018
 */
package sort;

public class InsertionSort1 {
    static void insertionSort1(int n, int[] arr) {
        int temp = 0;
        for(int i = arr.length-1;i>1;i--) {
            temp = arr[i];
            int j=i-1;
            while(j>= 0 && temp < arr[j]) {
                 if(temp < arr[j]) {
                    arr[j+1] = arr[j];
                    printArray(arr);
                }
                 arr[j] = temp;
                j--;
            }
            if(temp != arr[i]) {
                printArray(arr);
            }
            
        }
    }

    static void printArray(int[] arr) {
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int n = 10;//in.nextInt();
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9 ,10, 1};//new int[n];
//        for(int arr_i = 0; arr_i < n; arr_i++){
//            arr[arr_i] = in.nextInt();
//        }
        insertionSort1(n, arr);
//        in.close();
    }
}
