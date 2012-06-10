package util;
import java.util.ArrayList;

/**
 * Liste multi-objet
 * Liste basique pouvant prendre n'importe quel type d'objet
 * et permet plusieurs op�rations propres aux listes sur ces derniers
 * 
 * @author Florian Fritisse
 */

public class Liste {

	private ArrayList list;
	private int pointeur;
	
	/**
	 * Cr�� une nouvelle liste vide
	 */
	
	public Liste()
	{
		this.pointeur = 0;
		this.list = new ArrayList();
	}
	
	/**
	 * Cr�� une liste � partir d'une existante
	 * @param l liste � int�grer
	 */
	
	public Liste(ArrayList l)
	{
		this.list = l;
		this.pointeur = 0;
	}
	
	/**
	 * Ajoute un objet
	 * @param o objet � ajouter
	 */
	
	public void add(Object o)
	{
		this.list.add(o);
	}
	
	/**
	 * R�cup�re l'objet � la position souhait�e
	 * @param i position � r�cup�rer
	 * @return l'objet � la position i
	 */
	
	public Object get(int i)
	{
		return this.list.get(i);
	}
	
	/**
	 * R�cup�re l'objet point� par this.pointeur
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
	 * @return un bool�en indiquant si il y a un autre enregistrement apr�s celui point� par this.pointeur
	 */
	
	public boolean hasNext()
	{
		boolean b = true;
		
		if(this.pointeur >= this.list.size())
			b = false;
		
		return b;
	}
	
	/**
	 * Incr�mente le pointeur pour passer � l'enregistrement suivant
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
