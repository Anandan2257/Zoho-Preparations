class Shape {
    void display(){
        System.out.println("This is a shape");
    }
}

class Polygon extends Shape{
    void display(){
        System.out.println("Polygon is a shape");
    }
}

class Rectangle extends Polygon{
    void display(){
        System.out.println("Rectangle is a polygon");
    }
}

class Triangle extends Polygon{
    void display(){
        System.out.println("Triangle is a polygon");
    }   
}

class Square extends Triangle{
    void display(){
        System.out.println("Square is a rectangle");
    }
}


public class Test{
    public static void main(String[] args) {
        Shape obj = new Shape();
        obj.display();

        Polygon obj1 = new Polygon();
        obj1.display();

        Rectangle obj2 = new Rectangle();
        obj2.display();

        Triangle obj3 = new Triangle();
        obj3.display();

        Square obj4 = new Square();
        obj4.display();
    }
}

