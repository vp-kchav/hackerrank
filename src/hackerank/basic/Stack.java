package hackerank.basic;
import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        //Parser parser = new Parser();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(isBalanced(in.next()));
        }

        in.close();
    }

    static boolean isBalanced(String test) {
        java.util.Stack<Character> myStack = new java.util.Stack<>();
        if(test != null && test.length() == 0) {
            return true;
        } else {
            for (int i = 0; i < test.length(); i++)
            {
                char x = test.charAt(i);
                if (x == '(' || x == '[' || x == '{')
                {
                    myStack.push(x);
                    continue;
                }
                if(myStack.isEmpty()) return false;
                char check;
                switch (x)
                {
                    case ')':
                        check = myStack.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;

                    case '}':
                        check = myStack.pop();
                        if (check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = myStack.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }
            }
        }
        return myStack.isEmpty();
    }
}
