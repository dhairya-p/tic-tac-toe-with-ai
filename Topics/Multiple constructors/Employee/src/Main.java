class Employee {

    String name;
    int salary;
    String address;

    // Default constructor
    public Employee() {
        this("unknown", 0, "unknown");
    }

    // Second constructor
    public Employee(String name, int salary) {
        this(name, salary, "unknown");
    }

    // Third constructor
    public Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

}