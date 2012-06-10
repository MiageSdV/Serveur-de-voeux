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
	private Filiere filiere;
	private String plan;
	private String preRequis;
	private String objectifs;	
	
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getPreRequis() {
		return preRequis;
	}
	public void setPreRequis(String preRequis) {
		this.preRequis = preRequis;
	}
	public String getObjectifs() {
		return objectifs;
	}
	public void setObjectifs(String objectifs) {
		this.objectifs = objectifs;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
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
