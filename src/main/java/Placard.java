import java.util.*;

public class Placard {
    private LinkedList<Prenda> ropa;
    private Sugerencia sugerencia;

    public Placard(){

        this.ropa = new LinkedList<>();
        this.sugerencia = new Sugerencia();
    }

    public void agregarPrenda(Prenda ropa){
        this.ropa.add(ropa);
    }

    public Prenda tomarUnaPrenda (int i){

        try {
            return this.ropa.get(i);
        }

        catch (IndexOutOfBoundsException ex){
            return null;
        }
    }


    public Sugerencia sugerirVestuario (double temp){
        LinkedList<Prenda> listaSugerida = new LinkedList<>();

        ListIterator<Prenda> prendaListIterator = this.ropa.listIterator();
        Prenda unaPrenda;

        while (prendaListIterator.hasNext()){
            unaPrenda = prendaListIterator.next();

            if ((unaPrenda.getTempMax() > temp) && (unaPrenda.getTempMin() < temp)){
                switch (unaPrenda.getSubTipo()){
                    case PIERNAS:{
                        sugerencia.addPiernas(unaPrenda);
                        break;
                    }

                    case TORSO:{
                        sugerencia.addTorso(unaPrenda);
                        break;
                    }

                    case PIES:{
                        sugerencia.addPies(unaPrenda);
                        break;
                    }

                    case ACCESORIO:{
                        sugerencia.addAccesorios(unaPrenda);
                        break;
                    }
                }
            }
        }
        return sugerencia;
    }
}
