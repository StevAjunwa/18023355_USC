package usc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Data {
    
    // keyboard input
    Scanner sc = new Scanner(System.in);
    static int c;
    private ArrayList<Student> students;
    private Student s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
    private Exercise e1 ,e2, e3, e4, e5;
    private ArrayList<Exercise> exercises = new ArrayList<>();
    private Gym gym;
    private Exercise e;
    
    
    public Data(){
        gym = new Gym();
        e = new Exercise();
        
        // creates 5 exercise types
        e1 = new Exercise("Yoga", "Morning", 3, 50.50);
        e2 = new Exercise("Zumba", "Afternoon", 3, 45.00);
        e3 = new Exercise("Aquacise", "Evening", 3, 25.80);
        e4 = new Exercise("Boxfit", "Afternoon", 3, 40.35);
        e5 = new Exercise("Bodyblitz", "Morning", 3, 39.80);
        exercises = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));
        
        // adds exercise to gym
        gym.addExercise(e1);
        gym.addExercise(e2);
        gym.addExercise(e3);
        gym.addExercise(e4);
        gym.addExercise(e5);
        
        // 10 students created
        s1 = new Student("TIM");
        s2 = new Student("LEO");
        s3 = new Student("RIO");
        s4 = new Student("PETSON");
        s5 = new Student("ANTHONY");
        s6 = new Student("ABBEY");
        s7 = new Student("VALLY");
        s8 = new Student("DORA");
        s9 = new Student("ALICE");
        s10 = new Student("ANN");
        students = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10));
        
        // adds students
        e.registerStudent(s1);
        e.registerStudent(s2);
        e.registerStudent(s3);
        e.registerStudent(s4);
        e.registerStudent(s5);
        e.registerStudent(s6);
        e.registerStudent(s7);
        e.registerStudent(s8);
        e.registerStudent(s9);
        e.registerStudent(s10);  
    }
    public Student setName() {
        for (int j = 0; j < students.size(); j++) {
            System.out.println((j + 1) + ") " + students.get(j));
        }
        System.out.print("Select student: ");
        int i = sc.nextInt();
        i -= 1;
        if ( i > students.size() | i < 0) {
            System.out.println("Invalid entry\n");
            setName(); } 
        System.out.println("- " + students.get(i) + " -\n");
        return students.get(i); 
    }
    
    public Exercise setExercise() {
        for (int k = 0; k < exercises.size(); k++) {
            System.out.println((k + 1) + ") " + exercises.get(k));
        }
        
        System.out.print("Select exercise: ");
        int i = sc.nextInt();
        i -= 1;
        if ( i > exercises.size() | i < 0) {
            System.out.println("Invalid entry\n");
            setExercise(); }
        System.out.println("- " + exercises.get(i) + " -\n");
        return exercises.get(i);
    }
    
    public static void menu(){
        System.out.println("\n_______University Sports Centre (USC)______");
        System.out.println("|(1).      Book exercise class             |");
        System.out.println("|(2).      Change exercise class           |");
        System.out.println("|(3).      Cancel exercise class           |");
        System.out.println("|(4).      Give review                     |");
        System.out.println("|(5).      Print monthly report            |");
        System.out.println("|(0).      Quit                            |");
        System.out.println("|__________________________________________|\n");
    }
    
    public void run(){
        do
        {
            menu();
            try
            {
                c = sc.nextInt();
                switch (c)
                {
                    case 1:
                        gym.reserveSpot(setName(), setExercise());
                        break;
                    case 2:
                        System.out.println("Edit booking");
                        gym.changeExercise(setName(), setExercise());
                        break;
                    case 3:
                        System.out.println("Cancel  booked exercise");
                        gym.cancelBooking(setName(), setExercise());
                        break;
                    case 4:
                        System.out.println("Give review");
                        break;
                    case 5:
//                        System.out.println("Print monthly report");
                        gym.monthlyReport();
                        break;
                    case 0:
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
    
    
    
}
