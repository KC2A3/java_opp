import model.Klass;
import model.Student;
import model.Teacher;

public class main {
  public static void main(String[] args) {
    Klass klassOne = new Klass(1);
    Klass klassTwo = new Klass(2);
    Klass klassThree = new Klass(3);
    Student mike = new Student(4564,"mike",22,klassOne);
    Student Tom = new Student(9527, "Tom", 21, klassTwo);
    klassTwo.assignLeader(Tom);
    System.out.println(Tom.introduce());
    Teacher jack = new Teacher(23,"jack",21,new Klass[]{klassOne,klassThree});
    System.out.println(jack.introduce());
    System.out.println(jack.isTeaching(Tom));
  }
}
