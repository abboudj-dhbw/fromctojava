public class Main 
{

    public static void main(String[] args)
    {
        Dog d = new Dog("Snoop", "Labrador");

        Cat c = new Cat("Bob",true);

        // d.setName("Snoop");
        // c.setName("Katze");

        d.makeSound();

        c.makeSound();

        d.describe();

        c.describe();
    }
    
}
