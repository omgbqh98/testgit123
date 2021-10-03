import java.util.ArrayList;
import java.util.List;

public class Confnic {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.removeIf(h -> h.equals("1") || h.equals("2"));
        System.out.println(arr);
//        SingletonSampleHolder.INSTANCE
//        /chan qaiasdfasfs
        //22222
//        /chan qaiasdfasfs
        //sdfdf
    }
}
