import java.util.LinkedList;

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
}
