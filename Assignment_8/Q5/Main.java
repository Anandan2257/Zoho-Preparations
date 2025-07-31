class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow clone for Address
    }
}


class PersonShallow implements Cloneable {
    String name;
    Address address;

    PersonShallow(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // only top-level copy
    }
}


class PersonDeep implements Cloneable {
    String name;
    Address address;

    PersonDeep(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        PersonDeep cloned = (PersonDeep) super.clone();
        cloned.address = (Address) address.clone(); // clone nested object
        return cloned;
    }
}


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr1 = new Address("Chennai");

        // Shallow Copy Test
        PersonShallow p1 = new PersonShallow("Anand", addr1);
        PersonShallow p2 = (PersonShallow) p1.clone();

        p2.address.city = "Coimbatore"; // changes both!

        System.out.println("Shallow Copy:");
        System.out.println("p1 address: " + p1.address.city); // Coimbatore
        System.out.println("p2 address: " + p2.address.city); // Coimbatore

        // Deep Copy Test
        Address addr2 = new Address("Madurai");
        PersonDeep d1 = new PersonDeep("Bala", addr2);
        PersonDeep d2 = (PersonDeep) d1.clone();

        d2.address.city = "Salem"; // does not affect original

        System.out.println("\nDeep Copy:");
        System.out.println("d1 address: " + d1.address.city); // Madurai
        System.out.println("d2 address: " + d2.address.city); // Salem
    }
}
