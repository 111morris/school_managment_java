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
    this.feePaid = 0;
    this.feeTotal = 30000;
    this.id = id;
    this.name = name;
    this.grade = grade;
  }
  public void setGrade(int grade){
    this.grade = grade;
  }

  /*
  add the fees to the fees paid  
  the school is going to receive teh funds

   */
  public void updateFeesPaid(int fees){

  }
}

