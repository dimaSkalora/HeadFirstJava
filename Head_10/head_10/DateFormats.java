package head_10;

import java.util.Date;

public class DateFormats {
    public static void main(String[] args) {
        System.out.println(String.format("%tc",new Date()));
        System.out.println(String.format("%tr",new Date()));
        Date today = new Date();
        System.out.println(String.format("%tA, %tB, %td", today,today,today));
        System.out.println(String.format("%tA, %<tB, %<td", today));
    }
}
