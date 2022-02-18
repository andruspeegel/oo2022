import java.util.Scanner;

public class GAME2 {
    //main --> pakub
    public static void main(String[] args) {
        //sout --> pakub
        //String -- sõnaline muutuja
        //char -- üks täht
        // int -- täiskohaline
        //double -- 15 kohaline komakohaga number
        //float -- 7 kohaline komakohaga number
        //int -- täiskohaline number 2.1mlj
        //byte -- 128 kohta
        //short -- 32000 kohta
        //long -- 9,223,372,036,854,775,807 kohta
        //boolean -- kahendväärtus true/false
        // Math.random() -- 0 .. 0.9999
        World world = new World(5,10);
        Player mangija1 = new Player(world.worldHeight, world.worldWidth);
        Player mangija2 = new Player(world.worldHeight, world.worldWidth);

        Enemy vaenlane1 = new Enemy(world.worldHeight, world.worldWidth);

        world.printMap(mangija1.CoordinateY,mangija1.CoordinateX,
                 vaenlane1.CoordinateY,vaenlane1.CoordinateX);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            mangija1.movePlayer(input,world.worldHeight,world.worldWidth);
            world.printMap(mangija1.CoordinateY,mangija1.CoordinateX,
                    vaenlane1.CoordinateY,vaenlane1.CoordinateX);
            input = scanner.nextLine();
        }
    }
    //Funktsioonid tulevad mainist välja.
    //int -- sama tüüp mis peab olema funktsiooni sees return järgi
}
