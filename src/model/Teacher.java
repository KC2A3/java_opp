package model;

public class Teacher extends Person {
  private Klass[] klasses;

  public Teacher(int id, String name, int age, Klass[] klasses) {
    super(id, name, age);
    this.klasses = klasses;
  }

  public String introduce() {
    String str = null;
    if (this.klasses.length == 0) {
      return super.introduce() + "I am a Teacher. I teach No class.";
    } else {
      for (int i = 1; i < klasses.length; i++) {
        str += klasses[i].getNumber() + ",";
      }
    }
    return super.introduce() + "I am a Teacher. I teach Class" + str;
  }
}
