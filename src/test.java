import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        for (Integer i : integers) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
    }
}

//merge master
