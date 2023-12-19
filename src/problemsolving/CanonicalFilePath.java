package problemsolving;

import java.util.Stack;

public class CanonicalFilePath {
    public static String simplifiedPath(String path) {
        String[] splitedPath = path.split("/");
        Stack<String> myStack = new Stack<>();
        for(String myPath : splitedPath) {
            if(myPath.equals("..") & !myStack.isEmpty()) {
                myStack.pop();
            } else if(!myPath.equals(".") && !myPath.equals("") && !myPath.equals("..")) {
                myStack.push(myPath);
            }
        }
        return "/" + String.join("/", myStack);
    }

    public static void main(String arg[]) {
        String str = "/home/../foo/";
        System.out.println(simplifiedPath(str));
    }
}
