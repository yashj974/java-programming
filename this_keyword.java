//Create an Employee class with a parameterized constructor and use this to initialize data members.
 class Employee {

    String name;
    int id;

    // Parameterized Constructor
    Employee(String name, int id) {
        this.name = name; // Using 'this' to refer to the current object's data member
        this.id = id;     // Using 'this' to refer to the current object's data member
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Yash", 125);

        e1.display();
    }   
 }
