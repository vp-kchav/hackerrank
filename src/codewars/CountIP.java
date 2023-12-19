package codewars;

public class CountIP {
    public static long ipsBetween(String start, String end) {
        return convertToLong(end) - convertToLong(start);
    }

    private static long convertToLong(String ip) {
        long result = 0;
        for (String s : ip.split("\\.") )
            result = result * 256 + Long.valueOf(s);
        return result;
    }

    public static void main(String[] arg) {
//        System.out.println(ipsBetween("1.0.0.10", "1.0.0.60" ));
//        System.out.println(ipsBetween("20.0.0.10", "20.0.1.0" ));
        System.out.println(ipsBetween("0.0.0.0", "252.253.254.255" ));
    }
}
