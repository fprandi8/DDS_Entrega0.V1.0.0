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
    private String color1;
    private String color2;
    private String material;

    public Prenda(String subtipo, String material, String temp1, String temp2, String color1, String color2, String nombre){
        this.subtipo = subTipo.valueOf(subtipo);
        this.material = material;
        this.tempMin =  Double.parseDouble(temp1);
        this.tempMax = Double.parseDouble(temp2);
        this.nombre = nombre;
        this.color1 = color1;
        this.color2 = color2;

    };

    public Prenda(){

    };
    public Prenda.subTipo getSubTipo() {
        subTipo subtipo = this.subtipo;
        return subtipo;
    }

    public double getTempMin() {
        return tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getColor1() {
        return color1;
    }

    public String getColor2() {
        return color2;
    }

    public String getMaterial(){
        return material;
    }

}
