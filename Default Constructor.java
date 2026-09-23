class Employee {

    String name;
    int id;

    // Default Constructor
    Employee() {
        name = "Unknown";
        id = 0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.display();
    }
}