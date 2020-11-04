package interview;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RegExp {

    private static void validateEmail(List<String> emails) {
        String reg = "^([a-z]{1,6}_?)(|_[1-9]?[1-9]?[1-9]?[1-9]?)(@hackerrank.com)$";
        //"^[a-z]{1,6}|_(@hackerrank.com)$"
        for(String email : emails) {
            System.out.println(email.matches(reg));
        }
    }

    public static void main(String[] args) throws IOException {
        int[] arr = {2,4 ,3 ,5,20 ,21 ,6,40,10 ,5,2};
        //int[] arr = {1,2,2,3,1};
        List<String> emails = new ArrayList<>();
        emails.add("acdfdd@hackerrank.com");
        emails.add("acb12@hackerrank.com");
        emails.add("acb_123@hackerrank.com");
        emails.add("acbsdfdf_@hackerrank.com");
        validateEmail(emails);
    }
}
