public class Player {
    int CoordinateY;
    int CoordinateX;
    Direction direction;


    public Player(int worldHeight, int worldWidth) {
        this.CoordinateY = generateRandomCoordinate(worldHeight);
        this.CoordinateX = generateRandomCoordinate(worldWidth);
        this.direction = Direction.UP;
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }

    public void movePlayer(String input, int worldHeight, int worldWidth){
        // kontrollib ühte muutujat mingite väärtuste vastu
        switch (input) {
            case "a":
                direction = Direction.LEFT;
                break;
            case "s":
                direction = Direction.DOWN;
                break;
            case "d":
                direction = Direction.RIGHT;
                break;
            case "w":
                direction = Direction.UP;
                break;
        }
        switch (direction) {
            case LEFT:
                if (CoordinateX > 1) {
                    CoordinateX--;
                }
                break;
            case DOWN:
                if (CoordinateY < worldHeight-2) {
                    CoordinateY++;
                }
                break;
            case RIGHT:
                if (CoordinateX < worldWidth-2){
                    CoordinateX++;
                }
                break;
            case UP:
                if (CoordinateY > 1) {
                    CoordinateY--;
                }
                break;
        }
    }
}
