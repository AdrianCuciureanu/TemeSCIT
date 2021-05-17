package Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList library = new ArrayList();

        Book carteDeArta = new ArtBook("Locuinte colective", 142, "foarte buna");
        Book carteDeArta2 = new ArtBook("Flori", 49, "slaba");
        Book carteNuvela = new NovelBook("Lord of the rings", 240, "SF");
        Book carteNuvela2 = new NovelBook("Game of Thrones", 480, "SF");

        library.add(carteDeArta);
        printLibrary(library);

        library.add(carteDeArta2);
        printLibrary(library);

        library.remove(carteDeArta);
        printLibrary(library);

        library.add(carteNuvela);
        printLibrary(library);

        library.add(carteNuvela2);
        printLibrary(library);
    }

    private static void printLibrary(ArrayList library) {
        for (int i = 0; i < library.size(); i++) {
            System.out.println("Cartea " + library.get(i));
        }
        System.out.printf("\n");
    }
}
