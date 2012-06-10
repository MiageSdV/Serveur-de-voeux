package bdd;

/**
 * Objet permettant de construire une requête Xedix
 * en passant des paramètres simples et génère la requête de façon plus simple
 * 
 * @author Florian Fritisse
 */

public class RequeteXedix {

	private String requete1;
	private String requete2;
	
	/**
	 * Unique constructeur de la classe
	 * créé deux String qui contiendront les requêtes finales
	 */
	
	public RequeteXedix()
	{
		this.requete1 = "";
		this.requete2 = "";
	}
	
	/**
	 * 
	 * @param champ représente le champ de la table à récupérer
	 * @param table représente la table dans laquelle on veut le champ
	 */
	
	public void selectChamp(String champ, String table)
	{
		this.requete1+=champ+"<DANS>"+table;
	}
	
	/**
	 * Méthode surchargée qui va permettre d'ajouter un opérateur entre 2 sous-requêtes Xedix
	 * Doit être utilisée uniquement après selectChamp(String champ, String table)
	 * 
	 * @param champ représente le champ de la table à récupérer
	 * @param table représente la table dans laquelle on veut le champ
	 * @param liaison représente l'opérateur de liaison entre 2 "sous-requêtes"
	 */
	
	public void selectChamp(String champ, String table, String liaison)
	{
		this.requete1+="<"+liaison+">"+champ+"<DANS>"+table;
	}
	
	/**
	 * Méthode permettant de créer la seconde requête qui va affiner la recherche
	 * 
	 * @param champ représente le champ de la table
	 * @param valeur représente la valeur à récupérer
	 * @param table représente la table contenant le champ
	 */
	
	public void addWhere(String champ, String valeur, String table)
	{
		this.requete2+=table+"<all|16|"+champ+"|"+valeur+">;";
	}
	
	/**
	 * Permet d'initialiser la seconde requête d'affinage de résultat
	 * 
	 * @param nb Définit le nombre de résultat voulu
	 * @param depart Définit le départ des résultats recherchés
	 */
	
	public void initSecondRequete(String nb, String depart)
	{
		this.requete2+="<"+nb+"|"+depart+">;";
	}
	
	/**
	 * 
	 * @return La première requête nécessaire au requêtage Xedix
	 */
	
	public String getRequete1()
	{
		return this.requete1;
	}
	
	/**
	 * 
	 * @return La seconde requête nécessaire au requêtage Xedix
	 */
	
	public String getRequete2()
	{
		return this.requete2;
	}
}
