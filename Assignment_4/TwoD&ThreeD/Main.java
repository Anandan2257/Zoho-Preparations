class TwoD {
    int x;
    int y;

    TwoD(){
        x = 0;
        y = 0;
        System.out.println("TwoD default Constructor");
    }

    TwoD(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("TwoD Constructor with parameters");
    }

    void setX(int x){
        this.x = x;
    }

    int getX(){
        return x;
    }

    void setY(int y){
        this.y = y;
    }

    int getY(){
        return y;
    }
}

class ThreeD extends TwoD{
     int z;
    ThreeD(){
     super();
     z = 0;
   }

   ThreeD(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("ThreeD Constructor with parameters");
    }

    void setZ(int z){
        this.z = x;
    }

    int getZ(){
        return z;
    }

    public double distance(ThreeD other) {
    int dx = other.getX() - this.x;
    int dy = other.getY() - this.y;
    int dz = other.getZ() - this.z;

    double squareSum = dx * dx + dy * dy + dz * dz;
    return Math.sqrt(squareSum);
}


}

public class Main {
    public static void main(String[] args) {
        ThreeD point1 = new ThreeD();
        point1.setX(1);
        point1.setY(2);
        point1.setZ(3);

        ThreeD point2 = new ThreeD(4, 6, 8);

        double dist = point1.distance(point2);
        System.out.println("Distance between point1 and point2: " + dist);
    }
}