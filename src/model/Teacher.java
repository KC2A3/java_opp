package model;

public class Teacher extends Person {
  private Klass[] klasses;

  public Teacher(int id, String name, int age, Klass[] klasses) {
    super(id, name, age);
    this.klasses = klasses;
  }

  public boolean isTeaching(Student student) {
    for (Klass klass : klasses) {
      if (klass.inClass(student)) {
        return true;
      }
    }
    return false;
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

  public void knowStudent(Student student) {
    String outPut =
        "I am "
            + this.getName()
            + ". I know "
            + student.getName()
            + " has joined Class "
            + student.getKlass().getNumber()
            + ".";
    System.out.println(outPut);
  }

  public void knowLeader(Student student) {
    String outPut =
        "I am "
            + this.getName()
            + ". I know "
            + student.getName()
            + " become Leader of Class "
            + student.getKlass().getNumber()
            + ".";
    System.out.println(outPut);
  }
}
