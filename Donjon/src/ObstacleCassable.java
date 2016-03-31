import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0e652fd6-6645-4f40-a255-36bd7125b522")
public class ObstacleCassable extends Obstacle {
    public ObstacleCassable(int X, int Y) {
		super(X, Y);
	}

	@objid ("5715ba19-2130-4a31-9481-e42b9ddc9d9f")
    public Equipement equipement;

    @objid ("5bb0defd-27f7-499e-bd90-6c699da7e516")
    public void bloquer() {
    }

}
