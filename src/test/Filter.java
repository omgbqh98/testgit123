package test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {
        List<String> listOld = Arrays.asList("huynh","oki","ok");
        List<String> listNew = Arrays.asList("huynh","oki");
        List<String> delete = new ArrayList<>();
        List<String> add = new ArrayList<>();


        listOld.forEach(s -> {
            if (listNew.stream().noneMatch(s::equals)) {
                delete.add(s);
            }
        });

        listNew.forEach(s -> {
            if (listOld.stream().anyMatch(s::equals)) {
                add.add(s);
            }
        });

        System.out.println(add);
        System.out.println(delete);


//        listNew.forEach(s -> {
//            if (listOld.stream().noneMatch(s::equals)) {
//                delete.add(s);
//            }
//        });



//        Optional<String> result = stringList.stream().filter(s ->
//            !"huynh".equals(s)
//        ).findFirst();

//        Date now = new Date();
//        LocalDateTime nowL = now;

//        Date in = new Date();
//        LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
//        ldt.plusDays(2);
////        Date out = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
//        System.out.println(ldt);
//
    }

}
