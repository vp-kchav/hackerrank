package codewars;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ValidPin {
    public static boolean validatePin(String pin) {
        if (pin.chars().count() != 4 && pin.chars().count() != 6) return false;
        for(int i = 0; i<pin.chars().count(); i++) {
            if(!Character.isDigit(pin.charAt(i))) return false;
        }
        return true;

        //return pin.matches("\\d{4}|\\d{6}");
        //return pin.matches("[0-9]{4}|[0-9]{6}");

    }

    public static void main(String arg[]) {
        String me = "Cwm fjord bank glyphs vext quiz";
        if (me.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26){

        }
        if(me.toLowerCase().chars() .filter(ch -> Character.isAlphabetic(ch)).distinct().count() ==26){

        }
        System.out.println(me.substring(1,2+1));
        System.out.println(me.substring(2,2+1));
        //System.out.println(validatePin("1234"));

        Pair<String ,Integer> p = new Pair("123",2);
        System.out.println(p.getKey() + ":" +p.getValue());
        List<String> a =  new ArrayList<String>();
    a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-`)`"); a.add(";~("); a.add(":~D");
        List<String> smileysFace = Arrays.asList(")", "D");
        long ccount = a.stream().filter(arr1 ->
                smileysFace.stream().anyMatch(arr2 -> arr1.contains(arr2))).count();
        System.out.println(ccount);
    }
}
