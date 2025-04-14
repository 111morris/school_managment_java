import school_management_system.Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(42402, "morris Mulandi", 700000);
        System.out.println(teacher.getId());
        System.out.println(teacher.getSalary());
        int tempSalary = teacher.getSalary();
        teacher.setSalary(800000);
        System.out.println(teacher.getName() + " salary was changed from "+ tempSalary + " to " + teacher.getSalary());
    }
}