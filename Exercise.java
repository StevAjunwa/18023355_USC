package usc;

import java.util.ArrayList;


public class Exercise {


    private ArrayList<Student> students = new ArrayList<>();
    
    private String exerciseName;
    private String period;
    private int cap;
    private double cost;
    
    public Exercise(String exerciseName, String period, int slot, double cost) {
        this.exerciseName = exerciseName;
        this.period = period;
        this.cap = slot;
        this.cost = cost;
    }

    public Exercise() {
    }
    
    
    /**
     * @return the exercise name
     */
    public String getExerciseName() {
        return exerciseName;
    }
    
    /**
     * @return the period
     */
    public String getPeriod() {
        return period;
    }
    
    /**
     * @return the capacity
     */
    public double getCap() {
        return cap;
    }
    
    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }
    
    public boolean spaceRemaining() {
        return students.size() < getCap();
    }
    
    public boolean studentMember(Student s) {
        return students.contains(s);
    }
    
    public void registerStudent(Student s) {
        students.add(s);
    }
    
    public void unregisterStudent(Student s) {
        students.remove(s);
    }
        

    public String showExercise() {
        return "Exercise name: " + exerciseName + '\n' + 
               "Time of day: " + period + '\n' + 
               "Booked: " + getCap() + '\n';
    }
    
    // shows exercise
    @Override
    public String toString() {
        return exerciseName;
    }
    
    
    
    
}