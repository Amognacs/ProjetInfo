import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2589586d-09b3-4d9a-9ebb-320d081647b1")
public class PanMenu extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    
    @objid ("e41d49cf-4081-46dc-ae18-8acb269b7ed7")
    private File imageMenu = new File(""); // mettre une image pour le file

    @objid ("a078242e-47cb-4595-bc3a-2bb00dd7a67e")
    private Image image1;

    @objid ("6d5ce8cf-9fe2-455f-a53f-f2c108269a01")
    private JButton boutonCommencer = new JButton("COMMENCER UNE PARTIE");

    @objid ("abf9175c-8ab4-4030-927c-89839b257a63")
    private JButton boutonRegleJeu = new JButton("REGLES DU JEU");

    @objid ("b1f995b7-a5b6-43da-aa41-cfc770c5a1d3")
    private int etatFenetre;

    @objid ("1662b7d0-d1c2-4300-a44c-96976c84b35a")
    public void paintComponent(Graphics g) {
        g.drawImage(image1,0,0,this.getWidth(),this.getHeight(), this);
    }

    @objid ("c3e78b09-ac5b-4a04-9f85-8b7a3c7f7269")
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boutonCommencer){
            this.etatFenetre = 1;
        }
        if(e.getSource() == boutonRegleJeu){
            this.etatFenetre = 2;
        }
    }

    @objid ("e5bbd812-9e86-443c-8f14-f1225cc676fb")
    public PanMenu() {
        setLayout(null);
        boutonCommencer.setBounds(470, 0, 380, 40);
        add(boutonCommencer);
        boutonCommencer.addActionListener(this);
         
        boutonRegleJeu.setBounds(530, 50, 275, 40);
        add(boutonRegleJeu);
        boutonRegleJeu.addActionListener(this);
         
        Font f = new Font("Times New Roman", Font.BOLD, 25);
        boutonCommencer.setFont(f);
        boutonCommencer.setForeground(Color.RED);
        boutonCommencer.setBackground(Color.WHITE);
         
        Font f1 = new Font("Times New Roman", Font.ITALIC, 30);
        boutonRegleJeu.setFont(f1);
        boutonRegleJeu.setForeground(Color.BLACK);
        boutonRegleJeu.setBackground(Color.WHITE);
         
        try{
            this.image1 = ImageIO.read(imageMenu);  
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @objid ("b30f8bdd-f789-480d-9698-5ea830af341c")
    public int getEtatFenetre() {
        return etatFenetre;
    }

    @objid ("168c97d9-6c55-4973-8dbf-e31e9c32e15a")
    public void setEtatFenetre(int etat) {
        this.etatFenetre=etat;
    }

}
