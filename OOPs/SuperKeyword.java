package OOPs;

// super keyword is used to refer immediate parent class object.

// to access parent's properties
// to access parent's functions
// to access parent's constructor



public class SuperKeyword {

    public static void main(String[] args) {
        Horse h = new Horse();
        // Animal a = new Animal();
        System.out.println(h.color);
    }


}

class Animal {
    String color;
    Animal() {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        // super();
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }
}


