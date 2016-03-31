import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b0e87e3d-8ef7-47de-8fb8-76d08adf5228")
public class Personnage extends Element {
    
	@objid ("68748940-70dd-4bbe-b9c8-97bc3ef03e01")
    private int vie;

	public Personnage(int X, int Y) {
		super(X, Y);
	}

    @objid ("ffe919ad-61fd-47fa-8321-468d1b4b96d0")
    public void deplacement(int X, int Y) {
    	this.setCoordX(this.getCoordX() + X);
		this.setCoordY(this.getCoordY() + Y);
    }

    @objid ("fef3bab2-40a4-448d-a0dd-3b83d7bf2579")
    public void tuer() {
    }

    @objid ("fd1e3159-b06a-46d6-8bb7-5d231418f4b4")
    public void utiliserArme() {
    }

    @objid ("e86e4af5-3276-4d71-9fa3-d8c7d6b7ffc1")
    public void perdreDeLaVie() {
    }

}
