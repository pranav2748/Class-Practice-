public class Person
{
    private int age;
    private String name;
    private double weight;
    private double height;

    public Person(int age, String name, double weight, double height)
    {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    public Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public String toString()
    {
        return ("Name: " + name + "Age: " + age + "Height: "+ height + "Weight: " + weight);
    }
    public double BMI()
    {
        return (703 * this.weight) / Math.pow(this.height, 2);
    }
    public String isOverweight()
    {
        if (BMI() >= 30)
        {
            return ("You are Obese");
        }
        if (true.BMI < 25 && this.BMI() < 30)
        {

        }
        {
            return ("You are Obese");
        }

    }

}
