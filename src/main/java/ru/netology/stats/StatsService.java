package ru.netology.stats;

public class StatsService {

    public int totalSalesForAllMonths  (int[]salesOnMonths){
        // Метод Сумма прибыли по всем месяцам
        int sum = 0;
        // задаем переменную "сумма" , равную 0
        for (int sale : salesOnMonths) {
            // берем Sale значение переменной из массива
            sum += sale;
            // прибавляем значение Sale к Sum
        }
        return sum;
    }

    public int averageProfitMonths(int[]salesOnMonths){
        // Метод средняя прибыль
        // задаем переменную "Average" равную делению переменной сумма с кол-вом
        // значений в массиве
        int Average = totalSalesForAllMonths (salesOnMonths) / salesOnMonths.length;
        return Average;
}

    public int monthMaxSales (int[] salesOnMonths) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : salesOnMonths) {
            if (sale >= salesOnMonths[maxMonth]) {
                maxMonth = month;
            }
            month = month +1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int monthMinSales (int[] salesOnMonths) {
    int minMonth = 0;
    int month = 0; // переменная для индекса рассматриваемого месяца в массиве
    for (int sale : salesOnMonths) {
         if (sale <= salesOnMonths[minMonth]) {
             minMonth = month;
        }
    month = month +1; // следующий рассматриваемый месяц имеет номер на 1 больше
    }
     return minMonth + 1;
    }

    public int monthsSaleslowAverage (int[]salesOnMonths){
        // Метод расчета кол-во месяцев, с продажами были ниже среднего
        int monthsSales = averageProfitMonths(salesOnMonths);
        // задаем переменную равную средней прибыли
        int monthsBelowAverage = 0;
        // задаем переменную кол-во месяцев равную 0
        for (int sale : salesOnMonths) {
            // переменная Sale берет значение из массива salesOnMonths
            if (sale < monthsSales) {
                // если sale меньше, прибавляем к кол-ву месяц +1
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }

    public int monthsSalesMaxAverage(int[]salesOnMonths){
        // Метод расчета кол-во месяцев, с продажами были выше среднего
        int monthsSales = averageProfitMonths(salesOnMonths);
        // задаем переменную равную средней прибыли
        int monthsMaxMedian = 0;
        // задаем переменную кол-во месяцев равную 0
        for (int sale : salesOnMonths) {
           // переменная Sale берет значение из массива salesOnMonths
            if (sale > monthsSales) {
                // если Sale больше средней прибыли добавляем +1
                monthsMaxMedian++;
            }
        }
        return monthsMaxMedian;
    }
}