/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usc;

import java.util.Scanner;

/**
 *
 * @author Stephen
 */
public class Student {
           
    private String name, review;
    

    public Student(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * @return the review
     */
    public String getReview() {
        return review;
    }

    /**
     * @param review the review to set
     */
    public void setReview(String review) {
        Scanner sc = new Scanner(System.in);
        String write = sc.nextLine();
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}

