package Game;

public class Player extends Character implements WorldObject {
    Direction direction;
    Item item;


    public Player(int worldHeight, int worldWidth) {
        super(worldHeight, worldWidth);
        this.direction = Direction.UP;
    }

    public void addItem(Item item){
        this.item = item;
        System.out.println("Mängija sai eseme + " + item.itemType);
    }


    public void movePlayer(String input, int worldHeight, int worldWidth){
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
