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
  feePaid = 10,000 + 5000
  add the fees to the fees paid  
  the school is going to receive teh funds
   */

  public void payFees(int fees, School school){
    feePaid += fees;
    school.updateTotalMoneyEarned(fees);
  }

  /**
   *
   * @return id of the student
   */
  public int getId(){
    return id;
  }

  /**
   *
   * @return the name of the student
   */
  public String getName() {
    return name;
  }

  /**
   *
   * @return the grade of the student
   */
  public int getGrade(){
    return grade;
  }

  /**
   *
   * @return the fee paid by the student
   */
  public int getFeePaid(){
    return feePaid;
  }

  /**
   *
   * @return the total fees of the student
   */
  public int getFeeTotal(){
    return feeTotal;
  }

  /**
   *
   * @return fee paid
   */
  public int getRemainingFees(){
    return feeTotal-feePaid;
  }

}

