public class HouseWall extends Rectangle {
    private boolean hasWindow;
    private boolean hasDoor;
    private double brickLength;
    private double brickHeight;

    public HouseWall(double length, double height, boolean hasWindow, boolean hasDoor, double brickLength, double brickHeight) {
        super(length, height);
        this.hasWindow = hasWindow;
        this.hasDoor = hasDoor;
        this.brickLength = brickLength;
        this.brickHeight = brickHeight;
    }

    public double getWallArea() {
        double area = getArea();
        if (hasWindow) {
            area -= 1.5 * 1.5;
        }
        if (hasDoor) {
            area -= 2.0 * 0.9;
        }
        return area;
    }

    public int calculateBricks() {
        double wallArea = getWallArea();
        double brickArea = (brickLength / 100) * (brickHeight / 100);
        return (int) Math.floor(wallArea / brickArea);
    }

    public String toString() {
        return "Стена: длина " + length + " м, высота " + height + " м, площадь без окон/дверей "
                + getWallArea() +
                " м2, кирпичей нужно: " + calculateBricks();
    }
}
