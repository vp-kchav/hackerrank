package intuit;

import java.util.HashSet;
import java.util.Set;

//SWE2 or SSE
public class UniqueEmail {

    public static void main(String arg[]) {

        //Test1
        String[] emails1 = {"test.email+alex@intuit.com","test.e.mail+bob.cathy@intuit.com","testemail+david@int.uit.com"};
        System.out.println(findUniqueEmails(emails1));
        String[] emails2 = {"a@intuit.com","b@intuit.com","c@intuit.com"};
        System.out.println(findUniqueEmails(emails2));
        //Test2
    }

    public static int findUniqueEmails (String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) {
            String[] splitedEmail = email.split("@");
            String pre = splitedEmail[0];
            String post = splitedEmail[1];
            if(pre.contains(".")) {
                pre = pre.replace(".", "");
            }
            if(pre.contains("+")) {
                pre = pre.substring(0, pre.indexOf("+"));
            }
            uniqueEmails.add(pre + "@" +post);
        }
        uniqueEmails.forEach(String::toString);
        return uniqueEmails.size();
    }
}
