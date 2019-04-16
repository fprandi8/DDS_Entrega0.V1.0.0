import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParserPrenda {

    private String name;

    public ParserPrenda(String filename) {
        this.name = filename;
    }

    public void GuardarPrendas(String criterio, Placard MiPlacard) {

        String path = new File(this.name).getAbsolutePath();

        try (Scanner scanner = new Scanner(new File(path)).useDelimiter(criterio)) {
            while (scanner.hasNext()) {

                String token = scanner.next();
                String material = scanner.next();
                String tempMin = scanner.next();
                String tempMax = scanner.next();
                String nombre = scanner.next();
                String color1 = scanner.next();
                String color2 = scanner.next();

                Prenda prenda = new Prenda(token, material, tempMin, tempMax, color1, color2, nombre);
                MiPlacard.agregarPrenda(prenda);
                scanner.nextLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            this.name + "'" + "ex " + ex);
        }

    }
}