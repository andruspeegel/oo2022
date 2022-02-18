public class Enemy {
    int CoordinateY;
    int CoordinateX;

    public Enemy(int worldHeight, int worldWidth) {
        this.CoordinateY = generateRandomCoordinate(worldHeight);
        this.CoordinateX = generateRandomCoordinate(worldWidth);
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }
}
