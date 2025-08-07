import school_management_system.School;
import school_management_system.Student;
import school_management_system.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy =  new Teacher(1, "lizzy", 500);
        Teacher mellisa = new Teacher(002, "Mellisa", 700);
        Teacher kelvin = new Teacher(003, "Kelvin", 500);
        Teacher munga = new Teacher(004, "Munga", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(munga);

        Student tamasha = new Student(2000, "Tamasha", 4);
        Student rash = new Student(2001, "rashid", 12);
        Student mango = new Student(2002, "Mango", 10);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rash);
        studentList.add(mango);

        School kmc = new School(teacherList, studentList);
        System.out.println(" "+kmc.getTotalMoneyEarned());

        tamasha.payFees(1000, kmc);
    }
}