package model;

public class Klass {
  private int number;
  private Student leader;

  public Klass(int number) {
    this.number = number;
  }

  public int getNumber() {
    return this.number;
  }

  public Student getLeader() {
    return this.leader;
  }

  public void assignLeader(Student student) {
    if (student.getKlass().equals(this)) {
      this.leader = student;
    } else {
      System.out.println("It is not one of us.");
    }
  }

  public void appendMember(Student student) {
    student.setKlass(this);
  }
}
