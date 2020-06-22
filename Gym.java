package usc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Gym {
    
    private ArrayList<Student> students;
    private ArrayList<Student> nameRecords = new ArrayList<>();
    private ArrayList<Exercise> exercise = new ArrayList<>();
    private ArrayList<Exercise> exRecords = new ArrayList<>();
    Exercise e = new Exercise();
    
    public void addExercise (Exercise e) {
        exercise.add(e);
    }

        public boolean isExercise(Exercise e) {
        return exercise.contains(e);
    }
    
    public void reserveSpot (Student s, Exercise e) {
        if (!isExercise(e)) {
            System.out.print("\033[31m"); // Open print red
            System.out.println(e + " not found!");
        } else if (!e.spaceRemaining()) {
            System.out.println("No available space for " + e);
            System.out.print("\033[0m"); // Close print red
        } else {
            e.registerStudent(s);
            System.out.println(s.getName() + " has registered for the " + e.getPeriod() + " session of " + e.getExerciseName() + '.');
            nameRecords.add(s);
            exRecords.add(e);
        }
    }
    
    // shows students and exercise booked
    public void monthlyReport(){
        Iterator st = nameRecords.iterator();
        Iterator ex = exRecords.iterator();

        int i = 1;
        
        if (nameRecords.isEmpty() && exRecords.isEmpty()) {
            System.out.print("\033[31m"); // Open print red
            System.out.println("Empty list");
            System.out.print("\033[0m"); // Close print red

        } else {
            System.out.println("Student  Exercise");
            while (st.hasNext() && ex.hasNext()) {
                Object s = st.next();
                Object e = ex.next();
                System.out.print(i++);
                System.out.println(". "+ s + " - " + e);
            }
        }
    }
    
    // returns true if a student has booked and is in the 'nameRecords' list
    public boolean hasBookedBefore(Student s) {
        return nameRecords.contains(s);
    }
    
    // change type of exercise
    public void changeExercise(Student s, Exercise e){
        if (!hasBookedBefore(s)) {
            System.out.print("\033[31m"); // Open print red
            System.out.println("Book an exercise first");
            System.out.print("\033[0m"); // Close print red
        } else {
            System.out.println(s.getName() + " is now registered for " + 
                               e.getExerciseName() + " " + e.getPeriod() + " session.");
        }
    }
    
    // cancels booking
    public void cancelBooking(Student s, Exercise e) {
        if (!hasBookedBefore(s)) {
            System.out.print("\033[31m"); // Open print red
            System.out.println("Book an exercise first.\n");
            System.out.print("\033[0m"); // Close print red
        } else {
            System.out.println(s + " cancelled " + e + " session.");
        }
    }
    
    // displays the exercise class with the highest income
    public void highestIncome() {
         e.getCost();
    }
        

}
