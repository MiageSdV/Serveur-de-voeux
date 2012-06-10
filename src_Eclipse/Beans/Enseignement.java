package Beans;
import java.io.Serializable;


public class Enseignement implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idEnseignement;
	private String matiere;
	private String semestre;
	private String statutCours;
	
	public int getIdEnseignement() {
		return idEnseignement;
	}
	public void setIdEnseignement(int idEnseignement) {
		this.idEnseignement = idEnseignement;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getStatutCours() {
		return statutCours;
	}
	public void setStatutCours(String statutCours) {
		this.statutCours = statutCours;
	}
}
