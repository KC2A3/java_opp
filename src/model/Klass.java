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
}