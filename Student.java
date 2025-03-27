/** The Student class is a subclass of the Person class
 *  A student has both a name and an age, but also has
 *  a grade level and a GPA.
 */
public class Student extends Person
{
    private int grade;
    private double gpa;

    // TODO: Complete the non-default constructor.
    // We want this one to create a Student object with the
    // given parameter values. 
    public Student(String iName, String iAge, int iGrade, double igpa)
    {
        super(iName, iAge); // This calls Person(String, int), person is the super class
        grade = iGrade;
        gpa = igpa;
    }

    // TODO: Complete the non-default constructor.
    // We want this one to create a student named "John Doe",
    // age 0, with the given grade and gpa.
    public Student(int iGrade, double igpa)
    {
        super();
        grade = iGrade;
        gpa = igpa;

    }

    // TODO: Complete the default constructor
    // Default values should be "John Doe", age 0, grade 0,
    // and GPA of 0.0.
    public Student()
    {
        this("John Doe", 0, 0, 0.0);
    }


    // TODO: Add setters and getters; some have been done for you
    public void setGrade(int iGrade)
    {
        grade = iGrade;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setGPA(int igpa)
    {
        gpa = igpa;
    }

    public double getGPA()
    {
        return gpa;
    }
    // TODO: Complete the toString method so that when we print
    // out a Student object, it says
    // "A Student named [name], age [age], in grade [grade] with a GPA of [gpa]"
    public String toString()
    {
        return "Printing a Person object";
    }
}