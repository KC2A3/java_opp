package model;

public class Student extends Person {
  private Klass klass;

  public Student(int id, String name, int age, Klass klass) {
    super(id, name, age);
    this.klass = klass;
  }

  public Klass getKlass() {
    return this.klass;
  }

  public void setKlass(Klass klass) {
    this.klass = klass;
  }

  @Override
  public String introduce() {
    if (this.klass.getLeader().getId() == super.getId()) {
      return super.introduce() + " I am a Student. I am at Class " + this.klass + ".";
    } else {
      return super.introduce() + " I am a Student. I am Leader of Class " + this.klass + "2.";
    }
  }
}
