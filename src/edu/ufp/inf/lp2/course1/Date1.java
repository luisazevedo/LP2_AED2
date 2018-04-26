package edu.ufp.inf.lp2.course1;

import edu.ufp.inf.lp2.intro.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date1 {

    private int day;

    private int month;

    private int year;

    public Date1() {
        Calendar calendar = new GregorianCalendar();
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);

    }

    public int differenceYears(Date1 d) {

        int diference = this.getYear() - d.getYear(); // thtis . getyear (2015) - d.getYear(2017)
        return Math.abs(diference);// retorna o valor positvo sempre independetemente do resultado ser negativo 

    }

    public int differenceMonth(Date1 d) {

        int diferenca = this.getMonth() - d.getMonth() + (this.getYear() - d.getYear()) * 12;
        return Math.abs(diferenca);

    }

    public int differenceDays(Date1 d) {
        int diferenca = this.getDay() - d.getDay() + (this.getMonth() - d.getMonth()) * 31 + (this.getYear() - d.getYear()) * 365;
        return Math.abs(diferenca);
    }

    public boolean beforeDate(Date1 d) {
        if (this.year < d.year) {
            return true;
        } else if (this.year == d.year) {
            if (this.month < d.month) {
                return true;
            } else if (this.month == d.month) {
                if (this.day < d.day) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean afertDate(Date1 d) {

        if (this.year == d.year && this.month == d.month && this.day == d.day) {

            return false;
        }
        return !this.beforeDate(d);

    }

    public boolean isleapYear() {

        return (this.year % 400 == 0) || (this.year % 4 == 0 && this.year % 100 != 0);

    }

    public static boolean isleapYear(int year) {

        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

    }

    public static int daysMonth(int month, int year) {
        if (month >= 1 && month <= 12) {
            switch (month) {

                case 4:
                case 6:
                case 9:
                case 11:

                    return 30;
                case 2:

                    if (isleapYear(year)) {
                        return 29;
                    }

                    return 28;

                default:
                    return 31;

            }

        }
     if (month <1 && month >=12)
         
         System.out.println("Erro");
         return -1;
     
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    public Date1(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

}
