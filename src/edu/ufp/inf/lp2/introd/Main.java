/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.introd;

/**
 *
 * @author bernardomaia
 */
public class Main {

    public static void main(String[] args) {

        Point p = new Point(2.0f, 4.0f);

        Rectangle r = new Rectangle(p, p);

        System.out.println(" A distx é : " + p.distx(p));
        System.out.println(" A disty é : " + p.disty(p));
        System.out.println(" A dist é : " + p.dist(p));
        System.out.println(" A altura é : " + r.altura()+"m");
        System.out.println(" O comprimento é : " + r.comprimento()+"m");
        System.out.println(" A area é : " + r.area() + " m2");
        System.out.println(" O perímetro  é : " + r.perimetro() + " m");
        System.out.println(" A Diagonal : " + r.diagonal());

        Point p1 = new Point(1.0f, 1.0f);
        Point p2 = new Point(3.0f, 4.0f);
        Point p3 = new Point(2.0f, 3.0f);

        System.out.println(" o x é : "+p3.xBetweenPoints(p1, p2));
        System.out.println(" o y  é : " +p3.yBetweenPoints(p1, p2));

        System.out.println( " o factorial  do numero é : "+edu.ufp.inf.lp2.introd.Math.fact_r(4));

    }
}
