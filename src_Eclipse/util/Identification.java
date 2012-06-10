package util;

/**
 * Objet permettant d'authentifier l'utilisateur sur l'application
 * 
 * 
 * @author Florian Fritisse
 */

public class Identification {

	private String login;
	private String pass;
	
	/**
	 * Constructeur unique de la classe
	 * Prend en argument le login et le pass
	 * 
	 * @param l login de l'utilisateur
	 * @param p pass de l'utilisateur
	 */
	
	public Identification(String l, String p)
	{
		this.login = l;
		this.pass = p;
	}
	
	/**
	 * Non implémentée
	 * Va effectuer une requête en base afin de vérifier les données fournies pour l'authentification
	 * 
	 * @return true si valide, false sinon
	 */
	
	public boolean authentifier()
	{
		boolean b = false;
		
		//TODO requete en base
		
		return b;
	}
	
}
