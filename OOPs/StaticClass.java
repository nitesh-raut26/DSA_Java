package OOPs;


	// •	A static variable belongs to the class, not to individual objects.
	// •	All instances (objects) of the class share that same variable.
	// •	Only one copy of that variable exists in memory, no matter how many objects you create.

public class StaticClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        // schoolName is static keyword so that the every objects have schoolName constant 
        s1.roll = 3;
        // s1.schoolName = "DBCS";

        Student s2 = new Student();
        // System.out.println(s2.schoolName);
        // the roll is coming 0 because it is not static so for this object does not come.
        // static keyword allows only one create memory in the heap memory that referenced to same 
        System.out.println(s2.roll);


        // we shoudl write the Student.schoolName = "VMC"
        Student.schoolName = "VMC";
        System.out.println(Student.schoolName);
    }
}

class Student {
    
    static int getPercentage(int phy, int chem, int math){
        return (phy + chem + math) / 3;
    }

    String name;
    int roll;

    static String schoolName = "VMS";

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
