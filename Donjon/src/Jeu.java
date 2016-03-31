import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0251752d-766a-4239-a579-b5551f606f97")
public class Jeu {
    @objid ("7583d0db-c0d2-4361-ac7d-53adf43c9d48")
    private ArrayList<Labyrinthe> labyrinthe = new ArrayList<Labyrinthe> ();

    @objid ("afd227f8-fdef-49f2-96da-2c3c95289dde")
    private Vue vue;

    @objid ("1660d0c0-411c-492f-946e-1981fbd42304")
    public Jeu(Vue vue) {
    	this.vue = vue;
    }

}
