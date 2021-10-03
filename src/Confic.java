import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.xml.datatype.DatatypeConfigurationException;

public class Confic {

    public static void main(String[] args) {
        String s = "1,4,6,7,7,7dfg,,,,,,,4";

        String[] strings = s.split(",");

        Set<String> mySet = new HashSet<>(Arrays.asList(strings));
//        Set<Integer> m = new HashSet<>();
        for (String s1: mySet) {
            if (!s1.equals("")) {
            try {
                Integer integer = Integer.parseInt(s1);
                System.out.println(integer);
            } catch (Exception e) {
                System.out.println("loi" + s1);
            }
        }
        }
    }
}
