import java.io.Serializable;


public class Departement implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idDepartement;
	private String nomDepartement;
	
	public int getIdDepartement() {
		return idDepartement;
	}
	public void setIdDepartement(int idDepartement) {
		this.idDepartement = idDepartement;
	}
	public String getNomDepartement() {
		return nomDepartement;
	}
	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}

}
