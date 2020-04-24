/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stephen
 */
public class Booking {
    
    Scanner sc = new Scanner(System.in);
    
    ArrayList<Exercises> exercise = new ArrayList<>();
    ArrayList<Student> student = new ArrayList<>();
    static ArrayList<Student> classRec = new ArrayList<>();
    
    
    
    /**
     * @param e a student to the list
    */
    public void addExercise(Exercises e) {
        exercise.add(e);
    }
    
    /**
     * @param e
     * @return checks if a student has been added
    */
    public boolean isExercise(Exercises e){
        return exercise.contains(e);
    }
    
    public void bookExercise(Exercises e, Student stu) {
       if (!isExercise(e)) {
           System.out.println(e + " isn't an exercise at USC\n");
       } else if (!e.isStudent(stu)) {
           System.out.println(stu + "isn't a registered student\n");
       } else if (!e.slotsAvailable()) {
           System.out.println("Sorry, " + stu.getName() + " no available slot\n");
       } else {
           e.addStudent(stu); 
           classRec.add(stu);
           System.out.println(stu.getName() + " has booked " + e.getName()+ " exercise\n");
       }
    }
    
    public boolean bookedClasses(Student stu) {
        return classRec.contains(stu);
    }
    
    public void uscTimetable(){
        System.out.println("\n");
        String leftAlignFormat = "| %-13s | %-15d |%n";
        System.out.format("+--------------- U S C -----------+%n");
        System.out.format("| Exercise      | Slots available |%n");
        System.out.format("+---------------|-----------------+%n");
        for (int i=0; i < exercise.size(); i++) {
            System.out.printf(leftAlignFormat, exercise.get(i).getName(), exercise.get(i).getSlot());                    
        }
        System.out.format("+---------------------------------+%n\n");
        

//        for (int i=0; i < exercise.size(); i++) {
//            System.out.println("Exercise name: " + exercise.get(i).getName());
//            System.out.println("Available slot: " + exercise.get(i).getSlot());
//        }

        
    }
}
