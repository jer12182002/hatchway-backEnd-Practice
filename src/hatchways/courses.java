package hatchways;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jason
 */
public class courses {

    private int id;
    private String name, teacher;

    public courses(int i, String n, String t) {
        this.id = i;
        this.name = n;
        this.teacher = t;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "        Course: " + this.name + ", Teacher: " + this.teacher;
    }
}
