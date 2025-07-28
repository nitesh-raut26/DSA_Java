package OOPs;

// in this file we create multiple class

public class OOPS {
    public static void main(String[] args) {
        // className objName = new keyword created a memory for this object and Pen()
        // is constructor className();
        Pen p1 = new Pen(); // created a pen object called p1;
        Pen p2 = new Pen();
        // object created at heap memory;

        // any access the properties and function we have to use the dot operator

        // p1.setColor("Blue");
        // System.out.println(p1.color);

        // p1.setTip(7);
        // System.out.println(p1.tip);

        // p1.setColor("Yellow");
        // System.out.println(p1.color);

        // p1.color = "Red";
        // System.out.println(p1.color);

        // p1.setColor("Yellow");
        // System.out.println(p1.color);

        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(7);
        System.out.println(p1.getTip());

        p1.setColor("red");
        System.out.println(p1.getColor());

        System.out.println(p2.getColor());

        Student s1 = new Student("Nitesh");
        System.out.println(s1.name);

        Student s2 = new Student();
        System.out.println(s2.name);

        Student s3 = new Student(4);
        System.out.println(s3.rollNumber);

        Student s4 = new Student();
        s4.name = "nitesh";
        s4.age = 23;
        s4.percentage = 100;
        s4.password = "abcd";
        s4.marks[0] = 100;
        s4.marks[1] = 90;
        s4.marks[2] = 80;
        // s4.marks[3] = 80;

        Student s5 = new Student(s4); //copy
        s5.password = "def";
        System.out.println(s5.password);

        // for (int i = 0; i < s4.marks.length; i++) {
        //     System.out.println(s5.marks[i]);
        // }
        s4.marks[2] = 100; //here updated because of reference point to same array
        // Shallow copy means they pointed to reference 
        for (int i = 0; i < 3; i++) {
            System.out.println(s5.marks[i]);
        }

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Nitesh Raut";

        // this is not possible because password is private; 
        // so we can't assign the password 
        // myAcc.password = "abcdef";

        myAcc.setPassWord("abcdef");
        System.out.println(myAcc.username);

        // Inheritance
        // Fish shark = new Fish();
        // shark.color = "white";
        // shark.swim();
        // System.out.println(shark.color);

       
        // Multi-level Inheritance
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.color = "white";
        // dobby.legs = 4;
        // System.out.println(dobby.color);
        // System.out.println(dobby.legs);

        // Hirearchial Inheritance
        Bird pigeon = new Bird();
        pigeon.fly();


        // compile time polymosphism compiler have to known what type is given 
    // Method overloading example 
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1, 2));
        // Java used double when we write the 1.5 so we have to typecast the float
        System.out.println(cal.sum((float) 1.5, (float) 2.5));
        System.out.println(cal.sum(4, 5, 6));
        

        // Method overriding
        // Here it do eat function overrides of Human class that is also written.
        // in Richa Class so it does overrides
        // It is run time polymorphism
        Richa r = new Richa();
        r.eat();


        // Abstract method;
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Mustang m = new Mustang();
        // these output coming because the parent constructor called always;
        // animal constrctor called
        // Horse constructor called
        // Mustange constrcutor called



        Chicken clucky = new Chicken();
        clucky.eat();
        clucky.walk();
        System.out.println(clucky.color);

        // we cannot instantianted the object of abstract class
        // Animals a = new Animal(); because it is abstract class.

        //   Interface Multiple Inheritance
    
        Bear b = new Bear();
        b.eatMeat();
        b.eatPlants();
   

    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassWord(String newPassword) {
        password = newPassword;
    }

}

class Pen {
    // Prop + function
    private String color;
    private int tip;

    // getters
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // setters

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;
    int rollNumber;
    String password;
    int marks[];

    // this is copy constructor
    // Shallow Copy Constructor
    // Student(Student s4) {
    //     this.name = s4.name;
    //     this.age = s4.age;
    //     this.percentage = s4.percentage;
    //     this.rollNumber = s4.rollNumber;
    //     // this.password = s4.password;
    //     // marks = new int[3];
    //     this.marks = s4.marks;

    // }

    // deep copy constructor 
    // that doesn't reflect 
    Student(Student s4) {
        this.name = s4.name;
        this.age = s4.age;
        this.percentage = s4.percentage;
        this.rollNumber = s4.rollNumber;
        // this.password = s4.password;
        marks = new int[3];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s4.marks[i];
        }

    }

    Student(String name) {
        this.name = name;
        System.out.println("constructor is called");
        // 
    }

    Student() {
        System.out.println("constructor is called");
        marks = new int[3];
    }

    Student(int roll) {
        this.rollNumber = roll;
    }

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }

}

// Inheritance
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// single level Inheritance
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("fish is swimming");
//     }
// }

// multilevel Inheritance
// class Mammals extends Animal {
//     int legs;
// }

// class Dog extends Mammals {
//     String breed;
// }


// Hirearchial Inheritance
class Mammals extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swimming");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}


// Method Overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Method Overiding sam efunction same name and same parameters but have different thing to do.


class Human {
    void eat() {
        System.out.println("eat anything");
    }
}

class Richa extends Human {
    void eat() {
        System.out.println("eats vegeterian");
    }
}

// In the abstract class we cannot instantinated the objects.
// In the abstract methods we cannot implemented the functions;
abstract class Animals {
    String color;

    void eat() {
        System.out.println("animal eats");
    }

    Animals() {
        System.out.println("animal constrctor called");
        color = "brown";
    }

    abstract void walk();
}

// /subclass
// in the subclass we should have to implemeted the function walk function

class Horse extends Animals {
    // 
    void walk() {
        System.out.println("walks on 4 legs");
    }

    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustange constrcutor called");
    }
}

class Chicken extends Animals {
    void walk() {
        System.out.println("walks on 2 legs");
    }

}


// Interface
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
   public void moves() {
        System.out.println("up , down , left, right, diagonal(in all 4 dirns)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, right, left");
    }
}

// Multiple Inheritance
interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

// Bear implements both interfaces
class Bear implements Herbivore, Carnivore {

    @Override
    public void eatPlants() {
        System.out.println("Bear eats plants");
    }

    @Override
    public void eatMeat() {
        System.out.println("Bear eats meat");
    }
}
