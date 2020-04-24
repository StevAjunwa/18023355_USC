/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usc;

import java.util.ArrayList;

/**
 *
 * @author Osas
 */
public class Exercises {
    
    private String name;
    private String timeOfDay;
    private String slot;
    private ArrayList<Student> students = new ArrayList<>();
    private double amount;

    public Exercises(String name, String timeOfDay, String slot, double amount) {
        this.name = name;
        this.timeOfDay = timeOfDay;
        this.slot = slot;
        this.amount = amount;
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the timeOfDay
     */
    public String getTimeOfDay() {
        return timeOfDay;
    }

    /**
     * @param timeOfDay the timeOfDay to set
     */
    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    /**
     * @return the slot
     */
    public String getSlot() {
        return slot;
    }

    /**
     * @param slot the slot to set
     */
    public void setSlot(String slot) {
        this.slot = slot;
    }

    /**
     * @return the students
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString(){
        return getName() + '\n' +
               getAmount();
    }
    
}
    