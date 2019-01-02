/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatchways;

/**
 *
 * @author Jason
 */
public class marks {

    private int test_id, student_id;
    private double mark;

    public marks(int t, int st, double m) {
        this.test_id = t;
        this.student_id = st;
        this.mark = m;
    }

    public double getMark() {
        return this.mark;
    }

    public int getStudentId() {
        return this.student_id;
    }

    public int getTest_id() {
        return this.test_id;
    }

    public String toString() {
        return "mars@@ test_id=" + this.test_id + " student_id=" + this.student_id + " mark=" + this.mark;
    }

}
