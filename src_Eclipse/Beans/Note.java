package Beans;
import java.io.Serializable;


public class Note implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idNote;
	private float moyenne;
	private String typeNote;
	private Groupe groupe;
	
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	public Enseignement getEnseignement() {
		return enseignement;
	}
	public void setEnseignement(Enseignement enseignement) {
		this.enseignement = enseignement;
	}
	private Enseignement enseignement;
	
	public int getIdNote() {
		return idNote;
	}
	public void setIdNote(int idNote) {
		this.idNote = idNote;
	}
	public float getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}
	public String getTypeNote() {
		return typeNote;
	}
	public void setTypeNote(String typeNote) {
		this.typeNote = typeNote;
	}
}
