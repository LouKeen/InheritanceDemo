# Java Inheritance Example
Basic Java Inheritance.

In this repository we have 3 Java Classes( Main, Dog, and Animal ).

Let's start with the Animal Class.

This is your parent Class. As you could see it only has 1 method named `move` which simply prints out `The Animal is Moving`.

~~~
public class Animal {
    public void move() {
        System.out.println("The Animal is Moving");
    }
}
~~~

This is your child Class. As you could see it `extends`(inherits) the class `Animal`. Which means that it would also have access to the methods of the `Animal` Class.
~~~
public class Dog extends Animal {
    public void bark() {
        System.out.println("Arf!");
    }
}
~~~
This is your main Class. In the code below you will notice that we declared an `animal` object with the Data Type `Dog`. Eventhough the class `Dog` only has the method `bark`( refer to code above ). 
It also has access to the method `move` of the class `Animal` since it `extends`(inherits) that class.
~~~
public class Main {
    public static void main(String[] args) {
        Dog animal = new Dog();

        animal.bark();
        animal.move();
    }
}
~~~

Output:
~~~
The Animal is Moving
Arf!
~~~