/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usc;

import java.util.ArrayList;

/**
 *
 * @author Stephen
 */
public class Exercises {
    
    private String name;
    private String timeOfDay;
    private int slot;
    ArrayList<Student> students = new ArrayList<>();
    private double amount;

    public Exercises() {
        name = "";
        timeOfDay = "";
        slot = 0;
        amount = 0.0;
    }

    
    public Exercises(String name, String timeOfDay, int slot) {
        this.name = name;
        this.timeOfDay = timeOfDay;
        this.slot = slot;
    }

    
    /**
    * @return the name
    */
    public String getName() {
        return name;
    }

    /**
    * @return the timeOfDay
    */
    public String getTimeOfDay() {
        return timeOfDay;
    }
    
    /**
    * @return the slot
    */
    public int getSlot() {
        return slot;
    }

    /**
    * @param slot the slot to set
    */
    public void setSlot(int slot) {
        this.slot = slot;
    }

    public boolean slotsAvailable() {
        return students.size() < getSlot();
    }
    
    public int slotsRemaining(){
       return students.size();
    }

    /**
    * @param stu a student to the list
    */
    public void addStudent(Student stu) {
        students.add(stu);
    }
    
    /**
    * @param stu adds student to the list
    * @return checks if a student has been added
    */
    public boolean isStudent(Student stu){
        return students.contains(stu);
    }
    
    /**
    * @param amount
    */
    public void getAmount(double amount) {
        if (name.equalsIgnoreCase("Yoga")) {
            System.out.println(40.00); 
        } else if (name.equalsIgnoreCase("Zumba")) {
            System.out.println(25.50); 
        } else if (name.equalsIgnoreCase("Aquacise")) {
            System.out.println(50.00);
        } else if (name.equalsIgnoreCase("Boxfit")) {
            System.out.println(35.00); 
        } else if (name.equalsIgnoreCase("Bodyblitz")) {
            System.out.println(25.99);
        }
    }
        
    
    @Override
    public String toString(){
        return getName();
    }

    
}
    