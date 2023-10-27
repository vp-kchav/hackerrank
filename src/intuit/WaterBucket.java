package intuit;

public class WaterBucket {
    public static void main (String arg[]) {
        boolean posible = isPossible(4,5,2);
        System.out.println(posible);
        boolean posible1 = isPossible(1,8,3);
        System.out.println(posible1);
        boolean posible2 = isPossible(4,5,6);
        System.out.println(posible2);
        boolean posible3 = isPossible(3,3,2);
        System.out.println(posible3);
    }

    public static boolean isPossible(int x, int y, int z) {
        if(z > x & z > y) return false;
        int[] capReverse =  {y, x}; // store the other bucket to pure to
        int bucket[] = {0,0};
        while(checkBucket(bucket, z) == false) {
            for (int i=0; i < 2; i++) {
                return possibly(bucket, i, z, capReverse);
            }
        }

        return false;
    }


    static boolean possibly(int[] bucket, int index, int z, int[] capRe) {
        fillBucket(bucket, index, z);
        bucket = pureToBucket(bucket, index, capRe);
        if (checkBucket(bucket, z)) return true;
        bucket = emptyBucket(bucket, index);
        return false;
    }

    static public int[] fillBucket(int[] bucket, int index, int x) {
        bucket[index] = x;
        return bucket;
    }

    static public int[] pureToBucket(int[] bucket, int index, int[] capRe) {
        int indexToPure = index == 0 ? 1 : 0;
        bucket[indexToPure] = bucket[index] > capRe[index] ? capRe[index]  : bucket[index];
        return bucket;
    }

    static public int[] emptyBucket(int[] bucket, int index) {
        bucket[index] = 0;
        return bucket;
    }

    static boolean checkBucket(int[] bucket, int target) {
        for (int i = 0; i < bucket.length -1; i++) {
            if(bucket[i] == target) return true;
        }
        return false;
    }

}
