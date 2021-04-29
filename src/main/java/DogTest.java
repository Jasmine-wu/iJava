import java.io.*;
public class DogTest {

    public static void main(String[] args) {
            Dog bob = new Dog("bob", 44);
            bob.name="bob update";
            bob.eat();
            bob.run();
            System.out.println(bob.name);
            System.out.println(bob.sex);
            System.out.println(Dog.sexClass);



    }
}
