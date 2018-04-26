/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.files;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author bernardomaia
 */
public class FilePropertiesApp {

    public static void main(String argv[]) {

        try {

            File f = new File("/Users/bernardomaia/NetBeansProjects/LP2/src/edu/ufp/inf/lp2/files/teste.txt");

            System.out.println(f.getName());
            System.out.println(f.getPath());
            System.out.println(f.length());

            Date d = new Date(f.lastModified());
            System.out.println(d.toString());
            System.out.println(f.isDirectory());
            System.out.println(f.isFile());
            System.out.println(f.isHidden());
            System.out.println(f.canRead());

        } catch (Exception e){  // I0exception so pode ser usado quando escrevo ou leio para um ficheiro 

            System.out.println(e);

        }

        File folder = new File("/Users/bernardomaia/NetBeansProjects/LP2/src/edu/ufp/inf/lp2/files/test2.txt");

        File[] files = folder.listFiles();

        for (File file : files) {

            System.out.println(file.getName());

        }
        
        File srcFolder = new File ("/Users/bernardomaia/NetBeansProjects/LP2/src/edu/ufp/inf/lp2/files/test3.txt");
        String tabs = "";
        printRecursiveFolder(srcFolder,tabs);

    }

    
    
    
    private static void printRecursiveFolder(File folder , String tabs){
        
        
        File [] files = folder.listFiles();
        for(File f : files){
            
            System.out.println(f.getName());
            if(f.isDirectory()){
                
                printRecursiveFolder (f,tabs +"\t");
                
            }
            
            
        }
        
        
        
    }
    
    
    
    
}
