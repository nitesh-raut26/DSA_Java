package OOPs;

// public class ElectricCar {

// }
// public class ElectricCars {
//     public static void main(String[] args) {
//         final Car car = new ElectricCar();
//         System.out.println(car.drive());
//     }
// }

public class ElectricCar extends Car {
    @Override
    // runtime polymorpshim
    public final String drive() {
        return "Driving electric car";
    }

    public static void main(String[] wheels) {
        // runtime polymorphism
        final Car car = new ElectricCar();
        System.out.println(car.drive());
        // Driving electric car
    }
}

class Automobile {
    private String drive() {
        return "Driving vehicles";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "Driving car";
    }

}

// Second Question
// public class Shape {
//     protected void display() {
//         System.out.println("display-base");
//     }
// }

// public class Circle extends Shape {
//     <access-modifier> void display(){
//         System.out.println("Display-dervied");
//     }
// }

//  . A subclass cannot reduce the visibility of the overridden method. this is the reason due to answer is B.

// A. Only protected can be used.
// B. public and protected both can be used. this is output
// C. public,protected,and private can be used.
// d. Only public can be used.

// Third Question

/*
abstract class Car {
    static {
        System.out.print("1");
    }

    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}

public class BlueCar extends Car {
    {
        System.out.print("4");
    }
    
    public BlueCar() {
        super("blue");
        System.out.print("5");
    }
    
    public static void main(String[] gears) {
        new BlueCar();
    }
}
    
A. 23451
B. 12354
C. 13245 // this output
D. The code does not compile

Order
Step
Output
1 Static block of Car        1
2 Instance block of Car (before constructor) 3
3 Constructor of Car       2
4 Instance block of BlueCar      4
5   Constructor of BlueCar        5
// 13245

 */


 