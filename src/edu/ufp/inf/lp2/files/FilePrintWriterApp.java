/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author bernardomaia
 */
public class FilePrintWriterApp {

    public static void main(String argv[]) {

        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            File f = new File("/Users/bernardomaia/NetBeansProjects/LP2/src/edu/ufp/inf/lp2/files/test2.txt");
            fw = new FileWriter(f);
            pw = new PrintWriter(fw);
            System.out.println("Enconding" + fw.getEncoding());

            pw.println("Maria,12,15.5");
            pw.println("Pedro,9,12.5");
            pw.println("Miguel,5,14.5");
            pw.flush();

        } catch (IOException e) {
            System.out.println(e);
        } finally {

            try {
                if (pw != null) {
                    pw.close();
                }
                if (fw != null) {
                    fw.close();
                }

            } catch (IOException e) {

                System.out.println(e);
            }

        }

    }
}
