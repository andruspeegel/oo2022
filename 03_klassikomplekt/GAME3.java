import java.util.Scanner;
import java.util.Arrays;

public class GAME3 {
    public static void main(String[] args) {
        World world = new World(5,10);
        Player mangija1 = new Player(world.height, world.width);
        Player mangija2 = new Player(world.height, world.width);
        Enemy vaenlane1 = new Enemy(world.height, world.width);
        Item sword = new Item(world.height, world.width, ItemType.SWORD);
        Item hammer = new Item(world.height, world.width, ItemType.HAMMER);
        Item dagger = new Item(world.height, world.width, ItemType.DAGGER);
        world.items = Arrays.asList(sword,hammer,dagger);

        world.printMap(mangija1.CoordinateY,mangija1.CoordinateX,
                 vaenlane1.CoordinateY,vaenlane1.CoordinateX);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            mangija1.movePlayer(input,world.height,world.width);
            for (Item item:world.items){
                if (item.coordinateX == mangija1.CoordinateX && item.coordinateY ==
                mangija1.CoordinateY){
                    mangija1.addItem(item);
                }
            }
            world.printMap(mangija1.CoordinateY,mangija1.CoordinateX,
                    vaenlane1.CoordinateY,vaenlane1.CoordinateX);
            input = scanner.nextLine();
        }
    }
}
