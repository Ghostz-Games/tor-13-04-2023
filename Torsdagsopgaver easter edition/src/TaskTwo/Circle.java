package TaskTwo;

public class Circle {

    int radius;

    public Circle(int r){
        this.radius = r;
    }

    public void setRadius(int radius) {
        if(radius <= 0){
            throw new ArithmeticException("Radius cannot be 0 or lower");
        }else {
        this.radius = radius;
        }
    }

    public double getArea(){
        return (radius*2)*Math.PI;
    }



}

