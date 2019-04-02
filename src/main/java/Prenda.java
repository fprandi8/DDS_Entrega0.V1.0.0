public class Prenda {
    public enum subTipo {
        TORSO, PIERNAS, PIES, ACCESORIO;
    }
    public enum Color {
        NEGRO, BLANCO, ROJO, AZUL, VERDE, AMARILLO, VIOLETA, GRIS, MARRON, NARANJA, CELETES
    }
    private subTipo subtipo;
    private String nombre;
    private double tempMin;
    private double tempMax;
    private Color color1;
    private Color color2;
    private String material;

    public Prenda(String nombre){
        this.nombre = nombre;
    }

    public Prenda(){

    };

    public String NombrePrenda(){
        return this.nombre;
    }

    public static void main(String[] args) {
        Prenda prenda = new Prenda("Jean");
        System.out.println("La prenda es un " + prenda.nombre);
    }
}
