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
public class tests {
    private int id,course_id;
    private double weight;
    
    public tests(int i,int c, double w){
        this.id=i;
        this.course_id=c;
        this.weight=w;
    }
    
    public int getId(){
        return this.id;
    }

    
    public String toString(){
        return "test@@ id="+this.id +"course_Id="+this.course_id+" weight="+this.weight;
    }
}
