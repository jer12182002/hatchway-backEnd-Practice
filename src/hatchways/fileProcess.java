/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatchways;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jason
 */
public class fileProcess {

    FileReader fr = null;
    BufferedReader br = null;
    String ss;

    public String fileProcess() {
       
        try {
            fr = new FileReader("students.csv");
            br = new BufferedReader(fr);

            String s;

            try {
                while ((s = br.readLine()) != null) {
                    String[] tokens = s.split(",");
                    try {
                       
                        System.out.println(Integer.parseInt(tokens[0]));
                        
                    } catch (Exception e) {
                    }
                }

            } catch (IOException ex) {
                Logger.getLogger(Hatchways.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Hatchways.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }
}
