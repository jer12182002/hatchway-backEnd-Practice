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
public class students {

    private int id;
    private String name;

    public students(int i, String s) {
        this.id = i;
        this.name = s;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Student Id: " + this.id + ", name: " + this.name;

    }

}
