package Beans;
import java.io.Serializable;


public class Filiere implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idFiliere;
	private String nomFiliere;
	
	public int getIdFiliere() {
		return idFiliere;
	}
	public void setIdFiliere(int idFiliere) {
		this.idFiliere = idFiliere;
	}
	public String getNomFiliere() {
		return nomFiliere;
	}
	public void setNomFiliere(String nomFiliere) {
		this.nomFiliere = nomFiliere;
	}
	
}
