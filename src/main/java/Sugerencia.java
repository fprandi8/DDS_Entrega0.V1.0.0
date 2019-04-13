import java.util.LinkedList;
import java.util.ListIterator;

public class Sugerencia {
    private LinkedList<Prenda> torso;
    private LinkedList<Prenda> piernas;
    private LinkedList<Prenda> pies;
    private LinkedList<Prenda> accesorios;

    public Sugerencia(){
        this.torso = new LinkedList<>();
        this.piernas = new LinkedList<>();
        this.pies = new LinkedList<>();
        this.accesorios = new LinkedList<>();
    }

    public void addTorso (Prenda torso){
        this.torso.add(torso);
    }

    public void addPiernas(Prenda piernas){
        this.piernas.add(piernas);
    }

    public void addPies(Prenda pies){
        this.pies.add(pies);
    }

    public void addAccesorios(Prenda accesorios){
        this.accesorios.add(accesorios);
    }

    public LinkedList<Prenda> getTorso() {
        return torso;
    }

    public LinkedList<Prenda> getPiernas() {
        return piernas;
    }

    public LinkedList<Prenda> getAccesorios() {
        return accesorios;
    }

    public LinkedList<Prenda> getPies() {
        return pies;
    }

    public void mostrarSugerencia(){
        ListIterator<Prenda> prendaListIterator = this.torso.listIterator();
        while (prendaListIterator.hasNext()){
            Prenda prenda = prendaListIterator.next();
            System.out.println(prenda.getNombre() + prenda.getSubTipo() + prenda.getMaterial() + prenda.getColor2() + prenda.getColor1());
        }

        prendaListIterator = this.piernas.listIterator();
        while (prendaListIterator.hasNext()){
            Prenda prenda = prendaListIterator.next();
            System.out.println(prenda.getNombre() + prenda.getSubTipo() + prenda.getMaterial() + prenda.getColor2() + prenda.getColor1());
        }

        prendaListIterator = this.pies.listIterator();
        while (prendaListIterator.hasNext()){
            Prenda prenda = prendaListIterator.next();
            System.out.println(prenda.getNombre() + prenda.getSubTipo() + prenda.getMaterial() + prenda.getColor2() + prenda.getColor1());
        }

        prendaListIterator = this.accesorios.listIterator();
        while (prendaListIterator.hasNext()){
            Prenda prenda = prendaListIterator.next();
            System.out.println(prenda.getNombre() + prenda.getSubTipo() + prenda.getMaterial() + prenda.getColor2() + prenda.getColor1());
        }
    }

}
