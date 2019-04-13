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

    public void addAccesorios(Prenda accesorios){
        this.accesorios.add(accesorios);
    }

    public Prenda devolverTorsos(int i){
        try {
            return this.torso.get(i);
        }

        catch (IndexOutOfBoundsException ex){
            return null;
        }
    }
    public Prenda devolverPiernas(int i){
        try {
            return this.piernas.get(i);
        }

        catch (IndexOutOfBoundsException ex){
            return null;
        }
    }
    public Prenda devolverPies(int i){
        try {
            return this.pies.get(i);
        }

        catch (IndexOutOfBoundsException ex){
            return null;
        }
    }
    public Prenda devolverAccesorio(int i){
        try {
            return this.accesorios.get(i);
        }

        catch (IndexOutOfBoundsException ex){
            return null;
        }
    }
}
