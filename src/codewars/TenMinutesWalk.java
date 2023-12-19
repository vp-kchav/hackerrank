package codewars;

public class TenMinutesWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;
        int x=0, y=0;
        for(int i=0; i<walk.length; i++) {
            switch (walk[i]) {
                case 'n':
                    x++;
                    break;
                case 'e':
                    y++;
                    break;
                case 's':
                    x--;
                    break;
                case 'w':
                    y--;
                    break;
            }
        }
        return x==0 && y==0;
    }

    public static void main(String arg[]) {
        System.out.println(isValid((new char[] {'n','s','n','s','n','s','n','s','n','s'})));
    }
}
