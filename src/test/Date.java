package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

//        private static boolean isValidDate(String input) {
//            String formatString = "MM/dd/yyyy";
//
//            try {
//                SimpleDateFormat format = new SimpleDateFormat(formatString);
//                format.setLenient(false);
//                format.parse(input);
//            } catch (ParseException e) {
//                return false;
//            } catch (IllegalArgumentException e) {
//                return false;
//            }
//            return true;
//        }
//
//        public static void main(String[] args){
//            System.out.println(isValidDate("31/06/2021")); // false
//            System.out.println(isValidDate("12/12/2111")); // true
//        }



    public static void main(String[] args) throws ParseException {
        String date = "6/31/2012";
        LocalDate convertedDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("M/d/yyyy"));
        convertedDate = convertedDate.withDayOfMonth(
            convertedDate.getMonth().length(convertedDate.isLeapYear()));

        System.out.println(convertedDate);
    }
}
