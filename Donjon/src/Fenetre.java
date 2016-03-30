import java.awt.event.ActionListener;
import javax.swing.JFrame;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e75aa545-a3eb-47b8-8a47-cb4fcc6864d7")
public class Fenetre extends JFrame implements ActionListener {
    @objid ("3fb630c0-6922-4dc0-b153-9ea647e3b45b")
    private boolean boolContinueMenu;

    @objid ("afa78c12-7a23-42d3-b9f0-a3eea03d67fa")
    private boolean boolContinueGame;

    @objid ("837c130d-cc87-4605-a84d-afc325e11be3")
    private PanRegle panRegle;

    @objid ("73eb4e9b-0068-4ad0-8e86-e77424fd4370")
    private PanMenu panMenu;

    @objid ("833cd76c-0985-4741-99b9-e729d1aecadd")
    public Fenetre() {
        this.setTitle("DONJON");
        this.setSize(855, 875);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setResizable(false);
        this.setAlwaysOnTop(false);
    }

    @objid ("faba7c01-56cd-48df-a382-968a22e005fa")
    public void creationPanFenetre() {
        panMenu = new PanMenu();
        panRegle = new PanRegle();
        
        this.setContentPane(panMenu);
        this.setVisible(true);
        boolContinueGame = false;
        
        this.boolContinueMenu = true;
        while (boolContinueMenu){
            if (panMenu.getEtatFenetre() == 1){
                this.boolContinueMenu = false;
            }
            if (panMenu.getEtatFenetre() == 2){
                this.setContentPane(panRegle);
                this.setVisible(true);
                panMenu.setEtatFenetre(0);
            }
            if (panRegle.getEtatFenetre() == 3){
                this.setContentPane(panMenu);
                this.setVisible(true);
                panRegle.setEtatFenetre(0);
            }
        }
        boolContinueGame = true;
    }

    @objid ("75fe427b-3844-48d5-8da6-c04b358076c1")
    public boolean getContinuerJeu() {
        return boolContinueGame;
    }

}
