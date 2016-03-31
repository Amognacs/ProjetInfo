import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1ad4a709-d6ab-4e3d-879a-c7d244c63ab8")
public class PanRegle extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private File imageRegle = new File("");
    private Image image2;
    private JButton boutonRetourMenu = new JButton("REVENIR AU MENU PRINCIPAL");
    private int etatFenetre;
	
    public PanRegle(){
    	setLayout(null);
        boutonRetourMenu.setBounds(10, 0, 250, 40);
        add(boutonRetourMenu);
        boutonRetourMenu.addActionListener(this);
         
        Font f = new Font("Times New Roman", Font.ITALIC, 14);
        boutonRetourMenu.setFont(f);
        boutonRetourMenu.setForeground(Color.BLUE);
        boutonRetourMenu.setBackground(Color.WHITE);
         
        try {
            this.image2 = ImageIO.read(imageRegle);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
	@objid ("4a153973-d49d-465c-a36f-507cde93612f")
    public void paintComponent(Graphics g) {
		g.drawImage(image2, 0, 0, this.getWidth(), this.getHeight(), this);
    }

    @objid ("39a44fa3-7c94-4b35-bc93-ef6a6635d7e6")
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == boutonRetourMenu){
            this.etatFenetre=3;
        }
    }

    public int getEtatFenetre(){
        return etatFenetre;
    }
     
    public void setEtatFenetre(int etat){
        this.etatFenetre = etat;
    }
}
