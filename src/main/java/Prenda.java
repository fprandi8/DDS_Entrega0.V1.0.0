public class Prenda {
    private String nombre;

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
