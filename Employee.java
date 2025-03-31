/** Create an Employee class that extends the
 *  Person class.  An employee has a jobTitle,
 *  and a salary.
 */

public class Employee extends Person
{
    /* Employee inherits these from Person
    private String name;
    private int age; 
    */
    private String jobTitle;
    private int salary;

    public Employee(String name, int age, String jobTitle, int salary)
    {
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(String jobTitle, int salary)
    {
        super(); // java calls automatically
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee()
    {
        super();
        jobTitle = "Unemployed";
        salary = 0;
    }

    public void setTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }
}