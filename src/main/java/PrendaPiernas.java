public class PrendaPiernas extends Prenda {
    private static subTipo PIERNAS;
    private String nombre;
    private double tempMin;
    private double tempMax;
    private Color color1;
    private Color color2;
    private String material;

    public PrendaPiernas(String material, double temp1, double temp2, Color color1, Color color2, String nombre){
        this.material = material;
        this.tempMin = temp1;
        this.tempMax = temp2;
        this.nombre = nombre;
        this.color1 = color1;
        this.color2 = color2;

    };

    public PrendaPiernas(){

    }

    public String EsDe(){
        return this.material;
    }

    public String NombrePrenda(){
        return this.nombre;
    }

    public static void main(String[] args) {
    //    PrendaPiernas prenda = new PrendaPierna();
    //    System.out.println("La prenda es de ");
    }
}
