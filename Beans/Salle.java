import java.io.Serializable;


public class Salle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idSalle;
	private String numSalle;
	private String batiment;
	
	public int getIdSalle() {
		return idSalle;
	}
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}
	public String getNumSalle() {
		return numSalle;
	}
	public void setNumSalle(String numSalle) {
		this.numSalle = numSalle;
	}
	public String getBatiment() {
		return batiment;
	}
	public void setBatiment(String batiment) {
		this.batiment = batiment;
	}
	
}
