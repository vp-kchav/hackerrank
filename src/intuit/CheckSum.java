package intuit;

public class CheckSum {


    //Level Options: `swe1`, `swe2`, `sse`, `staff`
    public static void main(String arg[]) {
        //part 1
        int array[][] =  {{5,1,9,5},{7,5,3},{2,4,6,8}};
        int arrayp2[][] =  {{5,9,2,8},{9,4,7,3},{3,8,6,5}};

        int array2[][] = {{798,1976,1866,1862,559,1797,1129,747,85,1108,104,2000,248,131,87,95},
                {201,419,336,65,208,57,74,433,68,360,390,412,355,209,330,135},
                {967,84,492,1425,1502,1324,1268,1113,1259,81,310,1360,773,69,68,290},
                {169,264,107,298,38,149,56,126,276,45,305,403,89,179,394,172},
                {3069,387,2914,2748,1294,1143,3099,152,2867,3082,113,145,2827,2545,134,469},
                {3885,1098,2638,5806,4655,4787,186,4024,2286,5585,5590,215,5336,2738,218,266},
                {661,789,393,159,172,355,820,891,196,831,345,784,65,971,396,234},
                {4095,191,4333,161,3184,193,4830,4153,2070,3759,1207,3222,185,176,2914,4152},
                {131,298,279,304,118,135,300,74,269,96,366,341,139,159,17,149},
                {1155,5131,373,136,103,5168,3424,5126,122,5046,4315,126,236,4668,4595,4959},
                {664,635,588,673,354,656,70,86,211,139,95,40,84,413,618,31},
                {2163,127,957,2500,2370,2344,2224,1432,125,1984,2392,379,2292,98,456,154},
                {271,4026,2960,6444,2896,228,819,676,6612,6987,265,2231,2565,6603,207,6236},
                {91,683,1736,1998,1960,1727,84,1992,1072,1588,1768,74,58,1956,1627,893},
                {3591,1843,3448,1775,3564,2632,1002,3065,77,3579,78,99,1668,98,2963,3553},
                {2155,225,2856,3061,105,204,1269,171,2505,2852,977,1377,181,1856,2952,2262}};
        System.out.println("Part1 result 1: " + checkSum(array));
        System.out.println("Part1 result 2: " + checkSum(array2));

        //part2

        System.out.println("Part2 result 1: " + checkEven(arrayp2));
        System.out.println("Part2 result 1: " + checkEven(array2));
    }

    protected static int checkEven(int [][]array) {
        int sum = 0;
        for(int row = 0 ; row < array.length; row ++) {
            for(int col = 0; col< array[row].length-1 ; col++) {
                for (int colplus = col+1 ; colplus < array[row].length; colplus++) {
                    if (array[row][col] % array[row][colplus] == 0 || array[row][colplus] % array[row][col] == 0) {
                        sum += array[row][col] / array[row][colplus] > 0 ? array[row][col] / array[row][colplus] : array[row][colplus] / array[row][col];
                    }
                }
            }
        }
        return sum;
    }

    protected static int checkSum(int [][]array) {
        int sum=0;
        for(int row=0; row < array.length; row++) {
            sum += findMax(array[row]) - findMin(array[row]);
        }
        return sum;
    }

    protected static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }

    protected static int findMax(int[] arr) {
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

}
