public class Cat 
{
    private String name;
    private boolean isindoor;

    public Cat(String name, boolean isindoor)
    {
        this.name = name;
        this.isindoor = isindoor;
    }

    public void makeSound()
    {
        System.out.println("Miau, ich bin " + this.name);
    }

    public void describe()
    {
        System.out.println("Katze: " + this.name + (isindoor ? " Wohnungskatze":" Wildkatze"));
    }
    
}
