package job.karat;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentConfirmation {
    public static List<String> getPaymentConfirmationStatus(List<Integer> timestamps, List<Pair<Integer, Integer>> payments, int timeLimit) {
        List<String> result = new ArrayList<>();
        Map<Pair<Integer, Integer>, Integer> mapPayments = new HashMap<>();
        for(int i = 0; i<timestamps.size(); i++) {
            Pair<Integer, Integer> payment = payments.get(i);
            if(mapPayments.get(payment) == null) {
                result.add("False");
            } else {
                String value = timestamps.get(i) - mapPayments.get(payment) >= timeLimit ? "False" : "True";
                result.add(value);
            }
            mapPayments.put(payment, timestamps.get(i));
        }
        return result;
    }

    public static void printList(List<String> list) {
        for(String str : list) {
            System.out.print(str + " ");
        }
    }
}
