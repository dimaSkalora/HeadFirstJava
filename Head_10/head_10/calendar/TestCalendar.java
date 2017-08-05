package head_10.calendar;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2017,7,05,16,30);
        long day1 = c.getTimeInMillis();
        System.out.println(day1);
        day1 += 1000*60*60;
        System.out.println(day1);
        c.setTimeInMillis(day1);
        System.out.println("Новый час "+c.get(c.HOUR_OF_DAY));
        c.add(c.DATE,35);
        System.out.println("Добавить 35 дней "+c.getTime());
        c.roll(c.DATE,35);
        System.out.println("Прокрутить 35 дней  "+c.getTime());
        c.set(c.DATE,1);
        System.out.println("Установить дату в 1 "+c.getTime());

    }
}
