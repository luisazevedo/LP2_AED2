/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.inout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author bernardomaia
 */
public class CommonFiles {

    public final static String OPEN_MODE = "Open";
    public final static String SAVE_MODE = "Save";
    private static JFileChooser fileChooser;

    public static File getFile(JFrame jf, String dirpath, String mode) {

        fileChooser = new JFileChooser(dirpath);
        int option = (mode.compareTo(CommonFiles.OPEN_MODE) == 0 ? fileChooser.showOpenDialog(jf) : fileChooser.showSaveDialog(jf));
        if (option == JFileChooser.APPROVE_OPTION) {

            File f = fileChooser.getSelectedFile();

            return f;

        }

        return null;

    }

    public static BufferedReader openBufferedReader(File f) {

        try {

            FileReader f2 = new FileReader(f);

            BufferedReader br = new BufferedReader(f2);
            return br;

        } catch (FileNotFoundException ex) {

            Logger.getLogger(CommonFiles.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }

    public static PrintWriter openPrintWriter(File f) {

        try {

            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);

            return pw;

        } catch (IOException ex) {

            Logger.getLogger(CommonFiles.class.getName()).log(Level.SEVERE, null, ex);

        }

        return null;

    }

}
