import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String filePath = "/Users/macbookair/IdeaProjects/SugerenciaRopa/src/main/carga.txt";
        String fileName = "carga.txt";
        Sugerencia unaSugerencia = new Sugerencia();
        Placard placard = new Placard();
        try (Scanner scanner = new Scanner(new File(filePath)).useDelimiter(";")) {
            while (scanner.hasNext()) {

                String token = scanner.next();
                String material = scanner.next();
                String tempMin = scanner.next();
                String tempMax = scanner.next();
                String nombre = scanner.next();
                String color1 = scanner.next();
                String color2 = scanner.next();

                Prenda prenda = new Prenda(token, material, tempMin, tempMax, color1, color2, nombre);
                placard.agregarPrenda(prenda);
                scanner.nextLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'" + "ex " + ex);
        }

        unaSugerencia = placard.sugerirVestuario(24);
        unaSugerencia.mostrarSugerencia();

    }
}