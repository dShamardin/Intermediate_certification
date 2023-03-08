package ru.Task2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws Exception {

        Cactus cactus = new Cactus();
        Sensor sensor = new Sensor();

        try {
            System.out.println("Введите дату полива в формате: год-месяц-день");

            Scanner sc = new Scanner(System.in);
            String date = sc.nextLine();

            LocalDate ld = LocalDate.parse(date);
            //  LocalDate d1 = LocalDate.from(ld.getMonth());
            System.out.println(ld.getMonth());

            if (ld.getMonth().equals(Month.DECEMBER) || ld.getMonth().equals(Month.JANUARY) || ld.getMonth().equals(Month.FEBRUARY)) {
                ld.plusMonths(1);
                System.out.print(ld.plusMonths(1) + " ");
                cactus.WaterCactuc();
            }
            ;
            if (ld.getMonth().equals(Month.MARCH) || ld.getMonth().equals(Month.APRIL) || ld.getMonth().equals(Month.MAY)) {
                ld.plusWeeks(1);
                System.out.print(ld.plusWeeks(1) + " ");
                cactus.WaterCactuc();
            }
            ;
            if (ld.getMonth().equals(Month.JUNE) || ld.getMonth().equals(Month.JULY) || ld.getMonth().equals(Month.AUGUST)) {
                if (sensor.getLevelHumidity() < 30) {
                    System.out.println("Полить кактус");
                } else {
                    System.out.print(ld.plusDays(2) + " ");
                    cactus.WaterCactuc();
                }
            } else {
                ld.plusWeeks(1);
                System.out.print(ld.plusWeeks(1) + " ");
                cactus.WaterCactuc();
            }
        }
        catch (DateTimeParseException e) {
            System.out.println("Дата содержит неверный формат");
        }
    }
}

