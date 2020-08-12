package InheritanceDemo;

public class Animal1 {

    void eat()
    {
        System.out.println("Animal Eats");
    }

}

class Dog1 extends Animal1
{
    void bark()
    {
        System.out.println("Dog barks");
    }
}

class Lion extends  Animal1
{
    void roar()
    {
        System.out.println("lion roars");
    }
}


class TestInheritance2 {
    public static void main(String[] args) {

    Animal1 ob = new Animal1();
    ob.eat();

    Dog1 dog1 = new Dog1();
    dog1.eat();
    dog1.bark();


    Lion lion = new Lion();

    lion.eat();
    lion.roar();

    }
}
