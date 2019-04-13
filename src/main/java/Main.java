public class Main {

    public static void main(String[] args) {

        String filePath = "/Users/macbookair/IdeaProjects/SugerenciaRopa/src/main/carga.txt";
        String fileName = "carga.txt";
        Sugerencia unaSugerencia;
        Placard placard = new Placard();
        ParserPrenda parser = new ParserPrenda(filePath, fileName);
        parser.GuardarPrendas(";", placard);
        unaSugerencia = placard.sugerirVestuario(24);
        unaSugerencia.mostrarSugerencia();

    }
}