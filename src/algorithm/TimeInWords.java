package algorithm;

public class TimeInWords {

    public static String timeInWords(int h, int m) {
        String[] timeText = {"one", "two minutes", "three minutes", "four minutes", "five minutes", "six minutes", "seven minutes", "eight minutes", "nine minutes", "ten minutes", "eleven minutes", "twelve minutes", "thirteen minutes", "fourteen minutes", "quarter", "sixteen minutes", "seventeen minutes", "eighteen minutes", "nineteen minutes", "twenty minutes", "twenty one minutes", "twenty two minutes", "twenty three minutes", "twenty four minutes", "twenty five minutes", "twenty six minutes", "twenty seven minutes", "twenty eight minutes", "twenty nine minutes","half"};
        String hour = timeText[h-1].replace(" minutes", "");
        if (m==0) return hour + " o' clock";
        if (m==1) return "one minute past "+ hour;
        if (m > 30) return timeText[60-m-1] + " to " + timeText[h].replace(" minutes", "");
        return  timeText[m-1] + " past " + hour;

    }

    public static void main(String []arg) {
        System.out.println(timeInWords(3, 0));
        System.out.println(timeInWords(3, 1));
        System.out.println(timeInWords(4, 14));
        System.out.println(timeInWords(5, 15));
        System.out.println(timeInWords(6, 30));
        System.out.println(timeInWords(7, 45));
        System.out.println(timeInWords(7, 47));
        System.out.println(timeInWords(1, 1));
    }
}
