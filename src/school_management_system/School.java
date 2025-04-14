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

    /**
     *
     * @return the list of teachers into the school
     */
    public List<Teacher> getTeachers(){
        return teachers;
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudents(){
        return students;
    }

    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }

    /**
     * setters
     */

    /**
     * add a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * add a student to the school
     * @param student the student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * adds the total money earned by the school
     * @param MoneyEarned money that is supposed to be added
     */
    public void updateTotalMoneyEarned(int MoneyEarned){
        totalMoneyEarned += MoneyEarned;
    }

    /**
     * update the money that is spent by the school
     * @param MoneySpent the money
     */
    public void upadateTotalMoneySpent(int MoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }

}
