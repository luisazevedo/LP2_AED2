/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author bernardomaia
 */
public class FileReaderWriterApp {

    public static void main(String argv[]) {

        FileReader fr = null;
        BufferedReader bw = null;
        try {
            File f = new File("/Users/bernardomaia/NetBeansProjects/LP2/src/edu/ufp/inf/lp2/files/test2.txt");
            fr = new FileReader(f);
            bw = new BufferedReader(fr);
            String line = "";
            int linecount = 0;
            while ((line = bw.readLine()) != null) {
                System.out.println("LINE:" +      ++linecount + " " + line);

                StringTokenizer st = new StringTokenizer(line, ",");
                while (st.hasMoreTokens()) {

                    System.out.println(st.nextToken());

                }

            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {

            try {
                if (bw != null) {
                    bw.close();
                }
                if (fr != null) {
                    fr.close();
                }

            } catch (IOException e) {

                System.out.println(e);
            }

        }

    }

}
