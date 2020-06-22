package usc;


public class Student {
           
    private final String name;    

    public Student(String name) {
        this.name = name;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}

