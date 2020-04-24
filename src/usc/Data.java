/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Stephen
 */
public class Data {
    
    // keyboard input
    Scanner sc = new Scanner(System.in);
    static int c;
    
    private Exercises exercise;
    private Booking booking;
    private Exercises e1, e2, e3, e4, e5;
    private ArrayList<Exercises> exercises;
    private Student stu1, stu2, stu3, stu4, stu5, stu6, stu7, stu8, stu9, stu10;  
    private ArrayList<Student> student;

    public Data() {
        
        exercise = new Exercises();
        booking = new Booking();
        
        // creates 5 exercises
        e1 = new Exercises("Yoga", "Morning", 4);
        e2 = new Exercises("Zumba", "Afternoon", 4);
        e3 = new Exercises("Aquacise", "Morning", 4);
        e4 = new Exercises("Boxfit", "Evening", 4);
        e5 = new Exercises("Bodyblitz", "Afternoon", 4);
        exercises = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));
        
        // adding exercise to USC
        booking.addExercise(e1);
        booking.addExercise(e2);
        booking.addExercise(e3);
        booking.addExercise(e4);
        booking.addExercise(e5);
        
        // 10 students created
        stu1 = new Student("James");
        stu2 = new Student("Leo");
        stu3 = new Student("Rio");
        stu4 = new Student("Petson");
        stu5 = new Student("Anthony");
        stu6 = new Student("Abbey");
        stu7 = new Student("Vally");
        stu8 = new Student("Dora");
        stu9 = new Student("Alice");
        stu10 = new Student("Ann");
        student = new ArrayList<>(Arrays.asList(stu1, stu2, stu3, stu4, stu5, stu6, stu7, stu8, stu9, stu10));
        
        // 
        exercise.addStudent(stu1);
        exercise.addStudent(stu2);
        exercise.addStudent(stu3);
        exercise.addStudent(stu4);
        exercise.addStudent(stu5);
        exercise.addStudent(stu6);
        exercise.addStudent(stu7);
        exercise.addStudent(stu8);
        exercise.addStudent(stu9);
        exercise.addStudent(stu10);

    }
    
    public void dataRun(){  

        do
        {
            menu();
            try 
            {        
                c = sc.nextInt();
                switch (c)
                {
                    case 1:
                        System.out.println("book an exercise class");
                        booking.uscTimetable();
                        break;
                    case 2:
                        System.out.println("Change class");
                        break;
                    case 3:
                        System.out.println("Cancel  booked exercise");
                        break;
                    case 4:
                        System.out.println("Give review");
                        break;
                    case 5:
                        System.out.println("Print monthly report");
                        break;                        
                    case 6:
                        System.out.println("Thank you and goodbye!");
                        return;
                    default:
                          System.out.println("\nInvalid Option!");
                          break;
                }    
            } catch (InputMismatchException e) { 
                System.out.println("\nINVALID INPUT!"); 
                sc.next();
            }
            
        } while (c != 0);        
    }
    
    
    public void menu(){
        System.out.println(" Welcome to the University Sports Centre (USC)");
        System.out.println("                                                ");
        System.out.println(" Press 1 to - Book an exercise class           |");
        System.out.println(" Press 2 to - Change your exercise class       |");
        System.out.println(" Press 3 to - Cancel an exercise class         |");
        System.out.println(" Press 4 to - Review an exercise class         |");
        System.out.println(" Press 5 to - Print monthly report             |");
        System.out.println(" Press 6 to - Exit the program                 |");
       // System.out.println("|__________________________________________|");

    }
    
    
    
}
