import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9e811e9b-b7a6-47ac-9f6b-0a4ccca52ac7")
public class Labyrinthe implements Observable {
    @objid ("90632ef4-bf3d-412f-98e7-5ed072d063c6")
    private ArrayList<Heros> heros = new ArrayList<Heros> ();

    private ArrayList<EnnemiType1> ennemis1 = new ArrayList<EnnemiType1> () ;
    
    private ArrayList<EnnemiType2> ennemis2 = new ArrayList<EnnemiType2> ();
    
    private ArrayList<ObstacleIncassable> obstaclesIncassables = new ArrayList<ObstacleIncassable>();
    
    private ArrayList<ObstacleCassable> obstaclesCassables = new ArrayList<ObstacleCassable>();
    
    private int size;
    
    @objid ("85ab8494-aa21-4d08-b9b1-0812285de2f7")
    public void creationMap() {
    }

    @objid ("90732081-3e5f-48b8-af9e-1a810d0947a3")
    public Labyrinthe(int size) {
    	//creation du labyrinthe
    	for(int i = 0; i < size; i++){
			obstaclesIncassables.add(new ObstacleIncassable(i,0));
			obstaclesIncassables.add(new ObstacleIncassable(0,i));
			obstaclesIncassables.add(new ObstacleIncassable(i, size-1));
			obstaclesIncassables.add(new ObstacleIncassable(size-1, i));
		}
    	// ajout d'un joueur
    	heros.add(new Heros(10,10));
    	
    }

}
