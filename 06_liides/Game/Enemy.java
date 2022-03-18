package Game;

public class Enemy extends Character implements WorldObject {

    public Enemy(int worldHeight, int worldWidth) {
        super(worldHeight,worldWidth);
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }
}
