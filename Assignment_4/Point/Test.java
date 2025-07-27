import java.util.Scanner;

class Point {
    private int x;
    private int y;
    Point(){
        this.x = 0;
        this.y = 0;
    }

    void setPoint(int x,int y){
        this.x = x;
        this.y = y;
    }

    void printPoint(){
        System.out.println("X: " + x + " Y: " + y);
    }
}

class Circle extends Point{
    private int radius;
    Circle(){
        super();
    }

    void setRadius(int radius){
        this.radius = radius;
    }

    int getRadius(){
        return radius;
    }

    void area(){
        double area = 3.14 * getRadius() * getRadius();
        System.out.println("Area is " + area);
    }
}


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Y: ");
        int b = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Radius: ");
        int radius = sc.nextInt();
        sc.nextLine();
        Circle c = new Circle();
        c.setPoint(a, b);
        c.setRadius(radius);
        c.printPoint();
        c.area();
        sc.close();
    }
}
