/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.figgeo;

/**
 *
 * @author bernardomaia
 */
public class MainFigGeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle (new Point1(1,3), new Point1(3,1));
        System.out.println("O ponto : " +r.getPoint(0));
        System.out.println("O perimetro é: " + r.perimetro());
        System.out.println("A area é :" + r.area() + " m2");
        
        
        Rectangle r1 = new Rectangle ( new Point1 (1.5f,2), new Point1 (2,1.5f));
        System.out.println( "O r1 esta dentro do R: "+r.islnside(r1)); // quero saber se r1 esta dentro de r
    }
    
}
