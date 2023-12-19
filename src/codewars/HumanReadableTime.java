package codewars;

public class HumanReadableTime {

    public static String makeReadable(int seconds) {
//        String realS = String.format("%02d", seconds%60);
//        int minutes = seconds/60;
//        String realM = String.format("%02d",minutes%60);
//        String hours =String.format("%02d", minutes/60);
//        return hours+":"+realM+":"+realS;
        int s = seconds%60;
        int m = seconds/60%60;
        int h = seconds/3600;
        return String.format("%02d:%02d:%02d",h, m, s);
    }

    public static void main(String arg[]) {
        System.out.println(makeReadable(86399));
    }
}
