public class Main {

    public static void main(String[] args) {

        String fileName = "carga.txt";
        Sugerencia unaSugerencia;
        Placard placard = new Placard();
        ParserPrenda parser = new ParserPrenda(fileName);
        parser.GuardarPrendas(";", placard);
        unaSugerencia = placard.sugerirVestuario(24);
        unaSugerencia.mostrarSugerencia();

    }
}