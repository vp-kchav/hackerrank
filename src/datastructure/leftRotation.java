package datastructure;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class leftRotation {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        Integer[] result = new Integer[arr.size()];
        int startIndex = arr.size() - d;
        for(int i=0; i<arr.size();i++) {
            result[startIndex] = arr.get(i);
            startIndex++;
            if(startIndex == arr.size()){
                startIndex=0;
            }
        }
        return Arrays.asList(result);
    }

    public static void main(String[] args) throws IOException {
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr);
        List<Integer> list = rotateLeft(4,arrList);
        System.out.println(list.toString());
    }
}
