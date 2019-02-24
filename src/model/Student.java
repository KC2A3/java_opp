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
    return super.introduce() + " I am at Class " + this.klass + ".";
  }
}
