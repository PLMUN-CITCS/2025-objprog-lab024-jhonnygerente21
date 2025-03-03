class Person {
    // Attributes with access modifiers
    private String name;
    private int age;

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


public class PersonDemo {
    public static void main(String[] args) {
        // Create objects of Person class
        Person person1 = new Person("Bob", 30);
        Person person2 = new Person();

        // Display details
        person1.displayInfo();
        person2.displayInfo();
    }
}
