public class Person
{
    private String name;
    private int age;

    // TODO: Complete the non-default constructor
    public Person(String iName, int iAge)
    {
        this.name = iName;
        this.age = iAge;
    }

    // TODO: Complete the default constructor using "this"
    // Default values should be "John Doe", and 0
    public Person()
    {
        this("John Doe", 0);
    }


    // TODO: Add setters and getters; some have been done for you
    public void setName(String iName)
    {
        name = iName;
    }

    public String getName()
    {
        return name;
    }

    // TODO: Complete the toString method so that when we print
    // out a Person object, it says "A Person named [name], age [age]"
    public String toString()
    {
        return "A Person named " + name + ", age " +  age;
    }
}