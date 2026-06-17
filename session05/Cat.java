public class Cat extends Animal
{
    private boolean isindoor;

    public Cat(String name, boolean isindoor)
    {   
        this.name = name;
        this.isindoor = isindoor;
    }

    @Override
    public void makeSound()
    {
        System.out.println("Miau, ich bin " + this.name);
    }

    @Override
    public void describe()
    {
        System.out.println("Katze: " + this.name + (isindoor ? " Wohnungskatze":" Wildkatze"));
    }
    
}
