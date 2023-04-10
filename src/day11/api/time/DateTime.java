package day11.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTime {
    public static void main(String[] args) {
//        Date date = new Date();
//        Calendar calendar = Calendar.getInstance();

        //현재 날짜 정보 얻기(연,월,일)
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        //현재 날짜 정보 얻기(시,분,초)
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        //연월일시분초
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime = " + nowDateTime);

        //원하는 날짜정보만 얻기
        //365일중 몇일인가
        int dayOfYear = nowDateTime.getDayOfYear();
        System.out.println("dayOfYear = " + dayOfYear);

        //연도
        int year = nowDateTime.getYear();
        System.out.println("year = " + year);

        //특정 날짜 만들기
        LocalDateTime of = LocalDateTime.of(2023, 5, 12, 23, 00);
        System.out.println("of = " + of);

        //날짜 연산
        //도서 대여 시스템에서 빌린 날짜로부터 3일 후가 반납일
        LocalDateTime rentalDate = LocalDateTime.now();

        LocalDateTime localDateTime = rentalDate.plusDays(3);
        System.out.println("localDateTime = " + localDateTime);

        //빌드업 패턴
        LocalDateTime targetDateTime = rentalDate
                .plusYears(1)
                .plusMonths(2)
                .plusDays(10)
                .plusHours(5);

        //사이 날짜 구하기
        LocalDate b = LocalDate.of(2019, 12, 28);
        LocalDate d = LocalDate.of(2023, 3, 10);

        long between = ChronoUnit.DAYS.between(b, d);
        System.out.println("between = " + between);


        //날짜 포맷 바꾸기
        DateTimeFormatter dateTimeFormatter
                = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분");
        String dateString = nowDateTime.format(dateTimeFormatter);
        System.out.println("dateString = " + dateString);
        System.out.println("nowDateTime = " + nowDateTime);

    }
}
