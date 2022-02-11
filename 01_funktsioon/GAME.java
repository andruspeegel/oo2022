import java.util.Scanner;

public class GAME {
    //main --> pakub
    public static void main(String[] args) {
        //sout --> pakub
        System.out.println("Hello World");
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
        int worldHeight = 5;
        int worldWidth = 10;
        // Math.random() -- 0 .. 0.9999
        int playerCoordinateY = generateRandomCoordinate(worldHeight);
        int playerCoordinateX = generateRandomCoordinate(worldWidth);
        int enemyCoordinateY = generateRandomCoordinate(worldHeight);
        int enemyCoordinateX = generateRandomCoordinate(worldWidth);

        printMap(worldHeight,worldWidth,playerCoordinateY,playerCoordinateX,
                enemyCoordinateY,enemyCoordinateX);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            // kontrollib ühte muutujat mingite väärtuste vastu
            switch (input) {
                case "a":
                    playerCoordinateX--;
                    break;
                case "s":
                    playerCoordinateY++;
                    break;
                case "d":
                    playerCoordinateX++;
                    break;
                case "w":
                    playerCoordinateY--;
                    break;
            }
            printMap(worldHeight,worldWidth,playerCoordinateY,playerCoordinateX,
                    enemyCoordinateY,enemyCoordinateX);
            input = scanner.nextLine();
        }
    }
    //Funktsioonid tulevad mainist välja.
    //int -- sama tüüp mis peab olema funktsiooni sees return järgi
    public static int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }

    public static void printMap(int worldHeight, int worldWidth,
                                int playerCoordinateY, int playerCoordinateX,
                                int enemyCoordinateY, int enemyCoordinateX) {
        //fori --> pakub
        char symbol;
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) {
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                if (playerCoordinateY == y && playerCoordinateX == x) {
                    symbol = 'x';
                }
                if (enemyCoordinateY == y && enemyCoordinateX == x) {
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
