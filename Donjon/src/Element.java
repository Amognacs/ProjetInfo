import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2b1b7471-3ba2-4ecd-93eb-7c49c2d962f6")
public abstract class Element {
    @objid ("400effd8-573c-401b-80af-2c14ab67e41c")
    private int coordX;

    @objid ("7e45c7da-1127-44f6-884d-0604fac27429")
    private int coordY;

    public Element(int X, int Y){
    	this.setCoordX(X);
    	this.setCoordY(Y);
    }

    public int getCoordX(){
    	return this.coordX ;
    }
    
    public int getCoordY(){
    	return this.coordY ;
    }
    
    @objid ("f0166faa-193c-44a1-bb8c-4e956e069330")
    public void positionnementInitial() {
    }

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

}
