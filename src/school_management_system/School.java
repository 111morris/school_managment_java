package school_management_system;

import java.util.List;

/**
 * the school will have several teachers and students
 * ArrayList which implements teacher and student using an ArrayList
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * new school object is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * getters
     *
     */
    public List<Teacher> getTeachers(){
        return teachers;
    }
    public List<Student> getStudents(){
        return students;
    }
    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }
    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }

    /**
     * setters
     */
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned){
        this.totalMoneyEarned = totalMoneyEarned;
    }
    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }

}
