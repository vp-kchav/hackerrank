package codewars;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        modifyString(sb);
        System.out.println(sb.toString());
    }
    public static void display(int x, int y) {
        System.out.println("Method 3");
    }

    public static void display(double x, double y) {
        System.out.println("Method 4");
    }
    static void modifyString(StringBuilder s) {
        s.append(" is powerful");
        s = new StringBuilder("New StringBuilder");
        display(10, 20.0);
        display(15.5, 5);
    }
}