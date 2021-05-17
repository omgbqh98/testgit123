import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("huynh", "98", "ok chua");

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,6,5,3,2,2);

        integers.stream().sorted().limit(4).forEach(System.out::println);

//        collection.stream().forEach(s -> System.out.println(s));

//        List<Integer> stream = collection.stream().collect(Collectors.toList());

//        System.out.println(result);

        Iterator<String> iterator = collection.iterator();
//okokok
    }
}
