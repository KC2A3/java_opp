package model;

public class Student extends Person {
  private klass klass;

  public Student(int id, String name, int age, klass klass) {
    super(id, name, age);
    this.klass = klass;
  }

  public klass getKlass() {
    return this.klass;
  }

  public void setKlass(klass klass) {
    this.klass = klass;
  }

  public String introduce() {
    return super.introduce() + " I am at Class " + this.klass + ".";
  }
}
