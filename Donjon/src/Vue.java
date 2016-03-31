import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.awt.Color;
import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2c241493-a72c-4ddc-bed2-8e2b2ef1d2c1")
public class Vue implements Observer {
    @objid ("7961ed6d-03c6-4a62-bff1-9be717f7474b")
    public Fenetre fenetre;

    @objid ("b88a5ffa-6005-4448-9d97-4f1923736a3c")
    public PanJeu panJeu;

    @objid ("96ac004c-9f89-428f-9d04-e383dd528128")
    public ClavierGestion clavierGestion;

    @objid ("c39e537b-9467-43f1-a5bb-d1b39126065b")
    public List<Labyrinthe> observableReel = new ArrayList<Labyrinthe> ();

    public static void main(String[] args) {
		boolean boolBoucleMenu = true;
        Fenetre fenetre1 = new Fenetre();
        while (boolBoucleMenu){
            fenetre1.creationPanFenetre();
            boolean boolContinuer = true;
            while (boolContinuer){
                if (fenetre1.getContinuerJeu()){
                    boolContinuer = false;                   
                }
            }
        }
    }
}
