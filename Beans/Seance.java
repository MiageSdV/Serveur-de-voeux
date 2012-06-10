import java.io.Serializable;
import java.util.Date;


public class Seance implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idSeance;
	private Date date;
	private String typeCours;
	private float duree;
	private Salle salle;
	
	public int getIdSeance() {
		return idSeance;
	}
	public void setIdSeance(int idSeance) {
		this.idSeance = idSeance;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTypeCours() {
		return typeCours;
	}
	public void setTypeCours(String typeCours) {
		this.typeCours = typeCours;
	}
	public float getDuree() {
		return duree;
	}
	public void setDuree(float duree) {
		this.duree = duree;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
}
