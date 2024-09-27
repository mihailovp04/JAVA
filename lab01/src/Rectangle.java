public class Rectangle extends Side {
    protected double height;

    public Rectangle(double length, double height) {
        super(length);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return length * height;
    }

    public String toString() {
        return "Прямоугольник: длина " + length + " м, высота " + height + " м, площадь " + getArea() + " м2";
    }
}
