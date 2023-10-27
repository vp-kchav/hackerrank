package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ACMTeam {

    public static List<Integer> acmTeam(List<String> topic) {
//        int max = 0;
//        int number =0;
//        List<Integer> result = new ArrayList<>(2);
//        for (int i=0; i<topic.size()-1; i++) {
//            Set<Integer> listKnowTopic = new HashSet<>();
//            for (int x = 0; x < topic.get(i).chars().count(); x++) {
//                if (topic.get(i).charAt(x)== '1') listKnowTopic.add(x+1);
//            }
//            for(int j = i+1; j<topic.size(); j++) {
//                int countTopics = listKnowTopic.size();
//                for (int y = 0; y < topic.get(j).chars().count(); y++) {
//                    if (topic.get(j).charAt(y) == '1') {
//                        if(!listKnowTopic.contains(y+1)) countTopics++;
//                    }
//                }
//
//                if (countTopics > max) {
//                    max = countTopics;
//                    number =1;
//                } else if (countTopics == max) number++;
//            }
//        }
//        result.add(max);result.add(number);
//        return result;

        //optimize:
//        int max = 0;
        List<Integer> result = new ArrayList<>();
        int number =0;
        result.add(0);result.add(number);
        for (int i=0; i<topic.size()-1; i++) {
            for(int j = i+1; j<topic.size(); j++) {
                int countTopics = 0;
                for (int y = 0; y < topic.get(j).length(); y++) {
                    if (topic.get(i).charAt(y) == '1' || topic.get(j).charAt(y) == '1')  {
                        countTopics++;
                    }
                }

                if (countTopics > result.get(0)) {
                    number = 0;
                    result.set(0,countTopics);
                    result.set(1, ++number);
                } else if (countTopics == result.get(0)) result.set(1,++number);
            }
        }
        return result;
        // Write your code here

//        List<Integer> ans = new ArrayList<>();
//        int teams=0;
//        ans.add(0);
//        ans.add(teams);
//        int topicLen = topic.get(0).length();
//        for(int i = 0;i<topic.size()-1;i++){
//            for(int j = i+1;j<topic.size();j++){
//                int count=0;
//                for(int k =0;k<topicLen;k++){
//                    if(topic.get(i).charAt(k)=='1' || topic.get(j).charAt(k)=='1'){
//                        count++;
//                    }
//                }
//                if(count>ans.get(0)){
//                    teams=0;
//                    ans.set(0, count);
//                    ans.set(1, ++teams);
//                }
//                else if(count==ans.get(0)){
//                    ans.set(1, ++teams);
//                }
//            }
//
//        }
//        return ans;

    }

    public static void main(String arg[]) {
        List<String> topic = new ArrayList<>();
        topic.add("10101");topic.add("11100");topic.add("11010");topic.add("00101");
        List<Integer> result = acmTeam(topic);
    }
}
