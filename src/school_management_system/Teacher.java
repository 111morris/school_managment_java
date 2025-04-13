package school_management_system;
/*
this clas is responsible for keeping the track of teacher's name, id, salary.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * this creates a new teacher object
     * @param id for the teacher
     * @param name of the teacher
     * @param salary of the teacher
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return this.name;
    }
}
