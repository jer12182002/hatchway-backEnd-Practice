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
import java.util.Scanner;
/**
 *
 * @author Jason
 */
public class Hatchways {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<students> student = new ArrayList<students>();
    private static ArrayList<courses> course = new ArrayList<courses>();
    private static ArrayList<marks> mark = new ArrayList<marks>();
    private static ArrayList<tests> test = new ArrayList<tests>();

    public static void main(String[] args) {
        for (int i=1;i<101;i++){
            if(i%15==0){
                System.out.println("$$$@@@");
            }
            else if(i%3==0){
                System.out.println("$$$");
            }else if(i%5==0){
                System.out.println("@@@");
            }else{
                System.out.println(i);
            }
        }
        readFile("students.csv");
        readFile("courses.csv");
        readFile("marks.csv");
        readFile("tests.csv");

        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i).toString());

            System.out.print("Total Average:       ");
            double total = 0;
            int count = 0;
            for (marks mark1 : mark) {

                if (mark1.getStudentId() == student.get(i).getId()) {
                    total += mark1.getMark();
                    count++;
                }
            }
            System.out.printf("%.2f", total / count);
            System.out.println("%\n");
            total = 0;
            count = 0;
            for (marks m : mark) {
                if (m.getStudentId() == student.get(i).getId()) {
                    for (courses course1 : course) {
                        if (course1.getId() == m.getTest_id()) {
                            System.out.println(course1.toString());
                            System.out.printf("        Final Grade:    %.2f", m.getMark());
                            System.out.print("%\n\n");
                        }
                    }
                }
            }
            System.out.print("\n\n");

        }
tt(5);
    }
    private static void tt(int x){
        if(x>0){
        x-=1;
        tt(x);
        }
        System.out.println("@@"+x);
    }

    private static void readFile(String fileName) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String s;

            try {
                while ((s = br.readLine()) != null) {
                    String[] tokens = s.split(",");
                    if (fileName == "students.csv") {
                        try {
                            student.add(new students(Integer.parseInt(tokens[0]), tokens[1]));
                        } catch (Exception e) {
                        }
                    } else if (fileName == "courses.csv") {
                        try {
                            course.add(new courses(Integer.parseInt(tokens[0]), tokens[1], tokens[2]));
                        } catch (Exception e) {
                        }
                    } else if (fileName == "marks.csv") {
                        try {
                            mark.add(new marks(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2])));
                        } catch (Exception e) {
                        }
                    } else if (fileName == "tests.csv") {
                        try {
                            test.add(new tests(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2])));
                        } catch (Exception e) {
                        }
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
