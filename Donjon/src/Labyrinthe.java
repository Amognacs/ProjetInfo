import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9e811e9b-b7a6-47ac-9f6b-0a4ccca52ac7")
public class Labyrinthe implements Observable {
    @objid ("90632ef4-bf3d-412f-98e7-5ed072d063c6")
    public List<Element> element = new ArrayList<Element> ();

    @objid ("85ab8494-aa21-4d08-b9b1-0812285de2f7")
    public void creationMap() {
    }

    @objid ("90732081-3e5f-48b8-af9e-1a810d0947a3")
    public Labyrinthe() {
    }

}
