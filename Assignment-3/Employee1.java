class Employee1 {
    String name;
    int year;
    String address;

    Employee1(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    void display() {
        System.out.printf("%-10s %-15d %-20s\n", name, year, address);
    }

    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Robert", 1994, "64C- WallsStreat");
        Employee1 e2 = new Employee1("Sam", 2000, "68D- WallsStreat");
        Employee1 e3 = new Employee1("John", 1999, "26B- WallsStreat");

        System.out.printf("%-10s %-15s %-20s\n", "Name", "Year of Joining", "Address");
        e1.display();
        e2.display();
        e3.display();
    }
}
