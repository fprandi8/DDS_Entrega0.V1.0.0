public class PrendaPies extends Prenda {
    private static subTipo PIES;
    private String nombre;
    private double tempMin;
    private double tempMax;
    private String color1;
    private String color2;
    private String material;

    public PrendaPies(String material, double temp1, double temp2, String color1, String color2, String nombre){
        super();
        this.material = material;
        this.tempMin = temp1;
        this.tempMax = temp2;
        this.nombre = nombre;
        this.color1 = color1;
        this.color2 = color2;

    };
}
