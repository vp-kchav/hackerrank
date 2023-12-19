import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HomeDepotTest {

    public static void main(String arg[]) {
        String []str = {"Alice", "David", "Eva", "Charlie", "Bob"};
        List<String> listStr = Arrays.asList(str);
        List<String> sortedStr = listStr.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList());
        List<String> sortedStrFromArr = Arrays.stream(str).sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println(sortedStr);
        System.out.println(sortedStrFromArr);
    }
}
