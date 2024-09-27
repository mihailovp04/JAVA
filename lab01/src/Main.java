public class Main {
    public static void main(String[] args) {
        double brickLength = 15;
        double brickHeight = 35;

        HouseWall[] house1Walls = {
                new HouseWall(5, 3, true, false, brickLength, brickHeight),
                new HouseWall(5, 3, true, false, brickLength, brickHeight),
                new HouseWall(7, 3, true, false, brickLength, brickHeight),
                new HouseWall(7, 3, false, true, brickLength, brickHeight)
        };

        HouseWall[] house2Walls = {
                new HouseWall(4, 2.8, true, false, brickLength, brickHeight),
                new HouseWall(4, 2.8, true, false, brickLength, brickHeight),
                new HouseWall(8, 2.8, true, false, brickLength, brickHeight),
                new HouseWall(8, 2.8, false, true, brickLength, brickHeight)
        };

        int totalBricksHouse1 = 0;
        System.out.println("Первый дом:");
        for (HouseWall wall : house1Walls) {
            System.out.println(wall);
            totalBricksHouse1 += wall.calculateBricks();
        }
        System.out.println("Всего кирпичей для первого дома: " + totalBricksHouse1);

        int totalBricksHouse2 = 0;
        System.out.println("Второй дом:");
        for (HouseWall wall : house2Walls) {
            System.out.println(wall);
            totalBricksHouse2 += wall.calculateBricks();
        }
        System.out.println("Всего кирпичей для второго дома: " + totalBricksHouse2);
    }
}
