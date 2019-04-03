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

    public Prenda tomarUnaPrenda (){
        return this.ropa.getFirst();
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
                    }

                    case TORSO:{
                        sugerencia.addTorso(unaPrenda);
                    }

                    case PIES:{
                        sugerencia.addPies(unaPrenda);
                    }

                    case ACCESORIO:{
                        sugerencia.addAccesorios(unaPrenda);
                    }
                }
            }
        }
        return sugerencia;
    }
}
