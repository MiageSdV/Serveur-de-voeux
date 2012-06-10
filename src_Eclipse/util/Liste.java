package util;
import java.util.ArrayList;

/**
 * Liste multi-objet
 * Liste basique pouvant prendre n'importe quel type d'objet
 * et permet plusieurs opérations propres aux listes sur ces derniers
 * 
 * @author Florian Fritisse
 */

public class Liste {

	private ArrayList list;
	private int pointeur;
	
	/**
	 * Créé une nouvelle liste vide
	 */
	
	public Liste()
	{
		this.pointeur = 0;
		this.list = new ArrayList();
	}
	
	/**
	 * Créé une liste à partir d'une existante
	 * @param l liste à intégrer
	 */
	
	public Liste(ArrayList l)
	{
		this.list = l;
		this.pointeur = 0;
	}
	
	/**
	 * Ajoute un objet
	 * @param o objet à ajouter
	 */
	
	public void add(Object o)
	{
		this.list.add(o);
	}
	
	/**
	 * Récupère l'objet à la position souhaitée
	 * @param i position à récupérer
	 * @return l'objet à la position i
	 */
	
	public Object get(int i)
	{
		return this.list.get(i);
	}
	
	/**
	 * Récupère l'objet pointé par this.pointeur
	 * @return l'objet en question
	 */
	
	public Object get()
	{
		return this.list.get(this.pointeur);
	}
	
	/**
	 * 
	 * @return La taille de la liste
	 */
	
	public int size()
	{
		return this.list.size();
	}
	
	/**
	 * 
	 * @return un booléen indiquant si il y a un autre enregistrement après celui pointé par this.pointeur
	 */
	
	public boolean hasNext()
	{
		boolean b = true;
		
		if(this.pointeur >= this.list.size())
			b = false;
		
		return b;
	}
	
	/**
	 * Incrémente le pointeur pour passer à l'enregistrement suivant
	 */
	
	public void next()
	{
		this.pointeur++;
	}
	
	/**
	 * 
	 * @return true si la liste est vide, false sinon
	 */
	
	public boolean isEmpty()
	{
		return this.list.isEmpty();
	}
	
	/**
	 * Efface le contenu de la liste
	 */
	
	public void clear()
	{
		this.list.clear();
	}
}
