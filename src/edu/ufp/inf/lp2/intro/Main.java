/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.intro;

/**
 *
 * @author Suse Ribeiro
 */
public class Main {

    public static void main(String[] args) {
        Date d1 = new Date(1, 12, 2015);
        Date d2 = new Date(1, 1, 2017);
        Date today = new Date();
        d1.differenceYears(d2);
        System.out.println("Diferença de anos = " + d1.differenceYears(d2));
        d1.differenceMonths(d2);
        System.out.println("Diferença de meses = " + d1.differenceMonths(d2));
        d1.differenceMonths(d2);
        System.out.println("Diferença de dias = " + d1.differenceDays(d2));

        Person p = new Person("1", "José", "Rua X", new Date(1, 5, 1970));
        System.out.println("Idade = " + p.age());

        Date today1 = new Date();
        System.out.println("Data actual : " + today.toString());
        System.out.println("Before Date : "+today.beforeDate(today1));
        System.out.println("After Date : "+today.afterDate(today1));

        Date d3 = new Date(1, 1, 1900);
        System.out.println("Ano bissexto : "+d2.isLeapYear());
        System.out.println("Numero de dias do Mês: "+Date.daysMonth(2, 2017));

    }

}
