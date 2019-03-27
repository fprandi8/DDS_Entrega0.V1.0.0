public class PrendaPiernas extends Prenda {

    private String material;
    private int color;
    private int tempertura;
    private String nombre;

    public PrendaPiernas(String material, int tempertura, int color, String nombre){
        this.material = material;
        this.tempertura = tempertura;
        this.color = color;
        this.nombre = nombre;
    };

    public String EsDe(){
        return this.material;
    }

    public String NombrePrenda(){
        return this.nombre;
    }

    public int DeColor(){
        return this.color;
    }
    public static void main(String[] args) {
        PrendaPiernas prenda = new PrendaPiernas("Jean", 25, 0, "Pantalon de Jean");
        System.out.println("La prenda es de " + prenda.EsDe() + " de color " + prenda.DeColor() + " se llama " + prenda.NombrePrenda() );
    }
}
