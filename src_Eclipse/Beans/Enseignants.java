package Beans;
import java.io.Serializable;


public class Enseignants extends Utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idEnseignant;
	private String rattachement;
	private String Statut;
	private String serviceStatutaire;
	private String serviceEffectue;
	
	public int getIdEnseignant() {
		return idEnseignant;
	}
	public void setIdEnseignant(int idEnseignant) {
		this.idEnseignant = idEnseignant;
	}
	public String getRattachement() {
		return rattachement;
	}
	public void setRattachement(String rattachement) {
		this.rattachement = rattachement;
	}
	public String getStatut() {
		return Statut;
	}
	public void setStatut(String statut) {
		Statut = statut;
	}
	public String getServiceStatutaire() {
		return serviceStatutaire;
	}
	public void setServiceStatutaire(String serviceStatutaire) {
		this.serviceStatutaire = serviceStatutaire;
	}
	public String getServiceEffectue() {
		return serviceEffectue;
	}
	public void setServiceEffectue(String serviceEffectue) {
		this.serviceEffectue = serviceEffectue;
	}

}
