public class Dog extends Animal
{
    private String breed;

    public Dog(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void makeSound()
    {
        System.out.println("Woof, ich bin " + this.name);
    }

    @Override
    public void describe()
    {
        System.out.println("Hund: " + this.name + " Rasse: " + this.breed);
    }
    
}
