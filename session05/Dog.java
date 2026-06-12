public class Dog 
{
    private String name;
    private String breed;

    public Dog(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
    }

    public void makeSound()
    {
        System.out.println("Woof, ich bin " + this.name);
    }

    public void describe()
    {
        System.out.println("Hund: " + this.name + " Rasse: " + this.breed);
    }
    
}
