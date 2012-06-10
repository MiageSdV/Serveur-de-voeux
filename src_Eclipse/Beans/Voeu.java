package Beans;
import java.io.Serializable;


public class Voeu implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Enseignants enseignant;
	private Enseignement enseignement;
	private boolean enseigne;
	
	public Enseignants getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignants enseignant) {
		this.enseignant = enseignant;
	}
	public Enseignement getEnseignement() {
		return enseignement;
	}
	public void setEnseignement(Enseignement enseignement) {
		this.enseignement = enseignement;
	}
	public boolean isEnseigne() {
		return enseigne;
	}
	public void setEnseigne(boolean enseigne) {
		this.enseigne = enseigne;
	}
}
