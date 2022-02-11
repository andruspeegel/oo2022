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
        char symbol;

        //fori --> pakub
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {

                if (y == 0 || y == worldHeight-1) {
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
