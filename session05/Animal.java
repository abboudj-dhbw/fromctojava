public abstract class Animal 
{
    protected String name;

    public abstract void makeSound();

    public abstract void describe();

    public void setName(String name)
    {
        this.name = name;
    }
}
