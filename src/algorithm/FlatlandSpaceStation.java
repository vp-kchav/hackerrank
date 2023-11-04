package algorithm;

public class FlatlandSpaceStation {

    static int flatlandSpaceStations(int n, int[] c) {
        if(n == c.length) return 0;
        int maxLenght = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 0; j<c.length; j++) {
                min = Math.min(min, Math.abs(i-c[j]));
            }
            if (min > maxLenght) maxLenght= min;
        }
        return maxLenght;

    }

    public static void main(String []arg) {
        int arr1[] = {0, 4};
        int arr2[] = {1,2,3,4,5,6};
        System.out.println(flatlandSpaceStations(5,arr1));
        System.out.println(flatlandSpaceStations(6,arr2));

    }
}
