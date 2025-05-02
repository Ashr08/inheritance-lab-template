public class Main
{
  public static void main(String [] args)
  {
    // Student(String name, int age, String gender, String idNum, double gpa)
    Person me = new Student("H", 3, "F", "2584", 4.0);
    
    System.out.println("Hi, " + me.getName() + ". What's your GPA?");
    //System.out.println("My GPA is: " + ((Student)me).getGPA());

    Teacher you = new Teacher("C", 30, "F");
    //System.out.println("My teacher is: " + you.getName());


    //construct all classes and call their toString methods

    Person Bob = new Person("Bob", 18, "Male");
    Bob.toString();

    Student Taylor = new Student();
    Taylor.toString();

    CollegeStudent Aditya = new CollegeStudent("Aditya", 20, "male", "111463", "4.0", 2031, "Electrical Engineering");
    Aditya.toString();

    Teacher Cyr = new Student("Ms. Cyr", 28, "female", "Computer Science", "150000.0");
    Cyr.toString();
  }
}


