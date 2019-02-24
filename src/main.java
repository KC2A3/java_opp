import model.Klass;
import model.Student;

public class main {
  public static void main(String[] args) {
    Klass klassTwo = new Klass(2);
    Student Tom = new Student(9527, "Tom", 21, klassTwo);
    klassTwo.assignLeader(Tom);
    System.out.println(Tom.introduce());
  }
}
