package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int[] salesOnMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void totalSalesForAllMonths  () {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.totalSalesForAllMonths  (salesOnMonths);
        assertEquals(expected, actual);
        System.out.println ( "Общая прибыль - " + (expected == actual));
    }

    @Test
    void averageProfitMonths() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.averageProfitMonths(salesOnMonths);
        assertEquals(expected, actual);
        System.out.println ( "Средняя прибыль - " + (expected == actual));
    }

    @Test
    void monthMaxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.monthMaxSales(salesOnMonths);
        assertEquals(expected, actual);
        System.out.println ( "Месяц макс. продаж - " + (expected == actual));
    }

    @Test
    void monthMinSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.monthMinSales(salesOnMonths);
        assertEquals(expected, actual);
        System.out.println ( "Месяц мин. продаж - " + (expected == actual));
    }

    @Test
    void MonthsSaleslowMedian() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsSaleslowAverage(salesOnMonths);
        assertEquals(expected, actual);
        System.out.println ( "Кол-во месяцев меньше среднего - " + (expected == actual));
    }

    @Test
    void MonthsSalesMaxAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsSalesMaxAverage(salesOnMonths);
        assertEquals(expected, actual);
        System.out.println ( "Кол-во месяцев больше среднего - " + (expected == actual));
    }
}