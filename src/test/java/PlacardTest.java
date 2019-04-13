import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class PlacardTest {

    @Test
    public void validarPlacardSugerencia(){
cd
        String filePath = "/Users/macbookair/IdeaProjects/SugerenciaRopa/src/main/carga.txt";
        String fileName = "carga.txt";

        Placard placardTest = new Placard();

        ParserPrenda parserTest = new ParserPrenda(filePath, fileName);

        parserTest.GuardarPrendas(";", placardTest);

        Sugerencia sugerenciaTest = placardTest.sugerirVestuario(24);

        LinkedList<Prenda> torsos = sugerenciaTest.getTorso();
        LinkedList<Prenda> pieces = sugerenciaTest.getPies();
        LinkedList<Prenda> piernas = sugerenciaTest.getPiernas();

        Assert.assertTrue(torsos.size() >= 1);
        Assert.assertTrue(pieces.size() >= 1);
        Assert.assertTrue(piernas.size() >= 1);
    }

    @Test
    public void validarPlacardFiltroPorTemp(){

        String filePath = "/Users/macbookair/IdeaProjects/SugerenciaRopa/src/main/carga.txt";
        String fileName = "carga.txt";

        Placard placardTest = new Placard();

        ParserPrenda parserTest = new ParserPrenda(filePath, fileName);

        parserTest.GuardarPrendas(";", placardTest);

        Sugerencia sugerenciaTest = placardTest.sugerirVestuario(5);

        Assert.assertTrue(((sugerenciaTest.getAccesorios().get(0).getTempMax() > 5) && (sugerenciaTest.getAccesorios().get(0).getTempMin() < 5)));
    }
}
