import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c058189b-19af-4781-b26b-a184788073b9")
public class Armurie extends Equipement {
    @objid ("5beabf7b-b84f-4a2f-bcf3-bc170405b2c6")
    private int defense;

    @objid ("302adeee-cc09-49d9-b5b4-0ece862e6ea0")
    private int attaque;

    @objid ("7df8055a-e2b7-4a33-9fcf-24683a780ef7")
    int getDefense() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.defense;
    }

    @objid ("9144b6a5-b9e1-4006-9f1b-3b10fe378160")
    void setDefense(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.defense = value;
    }

}
