package bdd;

/**
 * Objet permettant de construire une requ�te Xedix
 * en passant des param�tres simples et g�n�re la requ�te de fa�on plus simple
 * 
 * @author Florian Fritisse
 */

public class RequeteXedix {

	private String requete1;
	private String requete2;
	
	/**
	 * Unique constructeur de la classe
	 * cr�� deux String qui contiendront les requ�tes finales
	 */
	
	public RequeteXedix()
	{
		this.requete1 = "";
		this.requete2 = "";
	}
	
	/**
	 * 
	 * @param champ repr�sente le champ de la table � r�cup�rer
	 * @param table repr�sente la table dans laquelle on veut le champ
	 */
	
	public void selectChamp(String champ, String table)
	{
		this.requete1+=champ+"<DANS>"+table;
	}
	
	/**
	 * M�thode surcharg�e qui va permettre d'ajouter un op�rateur entre 2 sous-requ�tes Xedix
	 * Doit �tre utilis�e uniquement apr�s selectChamp(String champ, String table)
	 * 
	 * @param champ repr�sente le champ de la table � r�cup�rer
	 * @param table repr�sente la table dans laquelle on veut le champ
	 * @param liaison repr�sente l'op�rateur de liaison entre 2 "sous-requ�tes"
	 */
	
	public void selectChamp(String champ, String table, String liaison)
	{
		this.requete1+="<"+liaison+">"+champ+"<DANS>"+table;
	}
	
	/**
	 * M�thode permettant de cr�er la seconde requ�te qui va affiner la recherche
	 * 
	 * @param champ repr�sente le champ de la table
	 * @param valeur repr�sente la valeur � r�cup�rer
	 * @param table repr�sente la table contenant le champ
	 */
	
	public void addWhere(String champ, String valeur, String table)
	{
		this.requete2+=table+"<all|16|"+champ+"|"+valeur+">;";
	}
	
	/**
	 * Permet d'initialiser la seconde requ�te d'affinage de r�sultat
	 * 
	 * @param nb D�finit le nombre de r�sultat voulu
	 * @param depart D�finit le d�part des r�sultats recherch�s
	 */
	
	public void initSecondRequete(String nb, String depart)
	{
		this.requete2+="<"+nb+"|"+depart+">;";
	}
	
	/**
	 * 
	 * @return La premi�re requ�te n�cessaire au requ�tage Xedix
	 */
	
	public String getRequete1()
	{
		return this.requete1;
	}
	
	/**
	 * 
	 * @return La seconde requ�te n�cessaire au requ�tage Xedix
	 */
	
	public String getRequete2()
	{
		return this.requete2;
	}
}
