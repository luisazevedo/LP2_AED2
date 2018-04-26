/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.randomfile;

import java.io.RandomAccessFile;

/**
 *
 * @author bernardomaia
 */
public class FileRandomAccessApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf = null;

        try {
            raf = new RandomAccessFile("/Users/bernardomaia/NetBeansProjects/LP2/src/edu/ufp/inf/lp2/randomfile/randomtext.txt",
                     "rw");
            long fp = raf.getFilePointer();
            System.out.println("fp=" + fp);
            long nbytes = 5L;
            raf.seek(nbytes);
            raf.writeBytes(" world and neighbourwood!");
            raf.seek(raf.length());
            raf.writeBytes("\r\nYet another text line append.");

            raf.seek(0L);
            System.out.println("" + raf.readLine());

        } catch (Exception e) {

        } finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (Exception e) {

            }
        }
    }

}
