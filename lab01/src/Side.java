public class Side {
    protected double length;

    public Side(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public String toString() {
        return "Длина: " + length + " м";
    }
}
