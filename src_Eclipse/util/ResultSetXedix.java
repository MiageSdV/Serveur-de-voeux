package util;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.sql.*;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;

/**
 * Objet permettant de Parser un fichier XML Xedix
 * et d'en tirer tous les attributs s�paremment
 * 
 * @author Florian Fritisse
 */

public class ResultSetXedix {

	private Document document;
	private Element racine;

	private SAXBuilder sxb = new SAXBuilder();
	
	private Vector Rows;        
    private HashMap Fields;   
            
	  
    /**
     * Unique constructeur de la classe
     * Prend un fichier XML en param�tre et extrait les donn�es
     * Place le tout dans une HashMap
     * 
     * @param fichier Le fichier XML � parser
     */
	  public ResultSetXedix(String fichier)
	  {
		  
		  this.Fields = new HashMap();
		  
		  try
		  {
		       document = sxb.build(fichier);
		     
			   racine = document.getRootElement();
			   List listEtudiants = racine.getChildren();

			   Iterator i = listEtudiants.iterator();
			   while(i.hasNext())
			   {
				  
			      Element courant = (Element)i.next();
			      String name = courant.getName();
			      
			      this.Fields.put(name, courant.getValue());
			   }
		  }
		  catch(Exception e){
			  
			  e.printStackTrace();
		  }
	  }
	
	  /**
	   * 
	   * @param name Le nom du champ dans la base
	   * @return La valeur stock�e de type chaine dans le fichier XML
	   * @throws java.sql.SQLException
	   */
	
	public String getString(String name) throws java.sql.SQLException
    {
	
		String val = "";
		
		val = (String)this.Fields.get(name);
		
		return val;
		
    }
	
	/**
	   * 
	   * @param name Le nom du champ dans la base
	   * @return La valeur stock�e de type entier dans le fichier XML
	   * @throws java.sql.SQLException
	   */
	
	public int getInt(String name) throws java.sql.SQLException
    {
		String val = "";
		
		val = (String)this.Fields.get(name);
		
		if (val != null) {
		    if (val.length() == 0) {
		    	return 0;
		    }
		    try {
		    	return Integer.parseInt(val);
		    } 
		    catch (NumberFormatException E) {
		    	throw new java.sql.SQLException ("Bad format for integer '" + val + "'", "S1009");
		    }
		}
		return 0;           // SQL NULL
    }
	
	/**
	   * 
	   * @param name Le nom du champ dans la base
	   * @return La valeur stock�e de type java.sql.Date dans le fichier XML
	   * @throws java.sql.SQLException
	   */
	
	public java.sql.Date getDate(String name) throws java.sql.SQLException
    {
		Integer Y = null, M = null, D = null;
		String S = "";
		
	   	try {
	   		
			
			S = (String)this.Fields.get(name);
		    
		    if (S == null) {
		    	return null;
		    }
		    else  {
					// Convert from TIMESTAMP
				switch (S.length()) {
				case 14: 
				case 8:
				    {
					Y =  new Integer(S.substring(0,4));
					M =  new Integer(S.substring(4,6));
					D =  new Integer(S.substring(6,8));
					return new java.sql.Date(Y.intValue()-1900, M.intValue()-1,D.intValue());
				    }
				case 12: 
				case 10: 
				case 6:
				    {
					Y  = new Integer(S.substring(0,2));
					M  = new Integer(S.substring(2,4));
					D  = new Integer(S.substring(4,6));
					return new java.sql.Date(Y.intValue(), M.intValue()-1,D.intValue());
				    }
				case 4:
				    {
					Y  = new Integer(S.substring(0,2));
					M  = new Integer(S.substring(2,4));
					return new java.sql.Date(Y.intValue(), M.intValue()-1, 1);
				    }
				case 2:
				    {
					Y  = new Integer(S.substring(0,2));
					return new java.sql.Date(Y.intValue(), 0, 1);
				    }
				default:
				    throw new SQLException("Bad format for Date '" + S + "'", "S1009");
				} 
		    
		    }
		    
		}
		catch( Exception e ) {
		    throw new java.sql.SQLException("Cannot convert value '" + S + "'", "S1009");
		}
    }
	
	/**
	 * Affiche la totalit� des valeurs stock�es dans la HashMap
	 */
	
	public void afficher()
	{
		Set keyset = this.Fields.keySet();
		
		Object[] o = keyset.toArray();
		
		for(int i = 0; i < o.length; i++)
		{
			System.out.println(this.Fields.get(o[i]));
		}
	}
}
