package InheritanceDemo;

public class Animal {

    void eat()
    {
        System.out.println("Animal Eats");
    }

}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog barks");
    }
}

class BabyDog extends Dog
{
    void weep()
    {
        System.out.println("baby dog weeps");
    }
}

class TestInheritance1
{
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        BabyDog babyDog = new BabyDog();
        babyDog.weep();
        babyDog.bark();
        babyDog.eat();


    }

}