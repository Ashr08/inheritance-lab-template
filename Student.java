public class Student extends Person{
  private String myIdNum; // Student Id Number
  private double myGPA; // grade point average

  // constructor
  public Student(String name, int age, String gender,
            String idNum, double gpa){
    // use the super class' constructor
    super(name, age, gender);

    // initialize what's new to Student
    myIdNum = idNum;
    myGPA = gpa;
  }

  public String getIdNum(){
    return myIdNum;
  }

  public double getGPA(){
    return myGPA;
  }

  public void setIdNum(String idNum){
    myIdNum = idNum;
  }

  public void setGPA(double gpa){
    myGPA = gpa;
  }

  // overrides the toString method in the parent class
  public String toString(){
    return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA;
  }
}


public class CollegeStudent extends Student(){
  private int year;
  private String major; 


  public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major){
    super(name, age, gender, idNum, gpa);

    this.year = year;
    this.major = major;
  }

  public void getYear(){
    return year;
  }
  
  public void getMajor(){
    return major; 
  }

  public int setYear(){
    this.year = year; 
  }

  public String setMajor(){
    this.major = major; 
  }

  public String toString(){
    return super.toString() + ", year: " + year + ", major: " + major + "is a CollegeStudent!";
  }

}