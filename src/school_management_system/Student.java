package school_management_system;
/*
this class is responsible for keeping the track of students fees, name, grade and fee
fee for every student is 830,000
fee paid initially is 0
 */
public class Student {
  private int id;
  private int age;
  private String name;
  private int grade;
  private int feePaid;
  private int feeTotal;

  public Student(int id, String name, int grade){
    this.id = id;
    this.name = name;
    this.grade = grade;
  }
}
