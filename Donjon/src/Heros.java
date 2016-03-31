import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("28a7fb70-f3cd-4e46-8c46-95191384159e")
public class Heros extends Personnage {
    @objid ("c5610b16-938a-4938-bb96-ec813ade88bf")
    public Sac sac;

    @objid ("b899766a-5630-486e-8f20-eaf542bbb0c3")
    public Equipement equipement;

    @objid ("e5188d02-88d0-40de-bcff-b296e3686354")
    public void tuer() {
    }

    @objid ("5bd57591-1ef9-433f-a5b8-b162f5552e01")
    public void deplacement() {
    }

    @objid ("eb678f04-468d-439c-b60b-3e5bbb408888")
    public Heros(int X, int Y) {
    	super(X, Y);
    }

    @objid ("bfc82f74-0437-457f-9389-43388a4aaf73")
    public void utiliserEquipement() {
    }

    @objid ("e2dea634-17b0-4153-b74f-a207f3c0fd83")
    public void utiliserArme() {
    }

}
