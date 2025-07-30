import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Sorting by id
    public int compareTo(Student that) {
        return this.id - that.id;
    }

    public String toString() {
        return id + " - " + name;
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(102, "Anandan"));
        list.add(new Student(101, "Anand"));
        list.add(new Student(103, "Abi"));

        Collections.sort(list);  // Uses compareTo()
        System.out.println(list);
    }
}
