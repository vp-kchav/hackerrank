package codewars;

import java.util.HashMap;
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
    }
}
