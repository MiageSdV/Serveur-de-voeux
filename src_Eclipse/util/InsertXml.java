package util;

import java.io.FileOutputStream;

import org.jdom2.Attribute;
import org.jdom2.DocType;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.ProcessingInstruction;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
/**
 * Objet de creer les fichiers xml en fonction des classe
 * 
 * 
 * @author Teddy Trifor
 */

public class InsertXml {

	   /**
	   * Methode qui de creer un fichier xml pour un professeur
	   * 
	   * @param les informations du professeur
	   * @return rien
	   * 
	   */  
  
	
	
	public void XmlProf(String idprof, String nomprof,  String prenomprof,String loginprof,String mdpprof,String flagadminprof,String rattachementprof, String Statutprof,String serviceStatutaireprof, String serviceEffectueprof){
		
		Element racine = new Element("enseignant");
		Document document = new Document(racine);
	
		  Element id = new Element("idEnseignant");
		  id.setText(idprof);
	      racine.addContent(id);
				
		  Element nom = new Element("nom");
		  nom.setText(nomprof);
	      racine.addContent(nom);
	      
	      Element prenom = new Element("prenom");
	      prenom.setText(prenomprof);
	      racine.addContent(prenom);
	      
	      Element login = new Element("login");
		  login.setText(loginprof);
	      racine.addContent(login);
	      
	      Element mdp = new Element("motdepasse");
		  mdp.setText(mdpprof);
	      racine.addContent(mdp);
	      
	      Element flagadmin = new Element("flagAdmin");
	      flagadmin.setText(flagadminprof);
	      racine.addContent(flagadmin);
	      
	      Element rattachement = new Element("rattachement");
	      rattachement.setText(rattachementprof);
	      racine.addContent(rattachement);
	      
	      
	      Element statut = new Element("statut");
	      statut.setText(Statutprof);
	      racine.addContent(statut);
	  
	      Element serviceStatutaire = new Element("serviceStatutaire");
	      serviceStatutaire.setText(serviceStatutaireprof);
	      racine.addContent(serviceStatutaire);
	     
	      Element serviceEffectue = new Element("serviceEffectue");
	      serviceEffectue.setText(serviceEffectueprof);
	      racine.addContent(serviceEffectue);
	      affiche(document);
	      enregistre("/bdd/professeur.xml",document);
		
		
		
	}
	/**
	   * Methode qui de creer un fichier xml pour un enseignement
	   * 
	   * @param les informations du enseignement
	   * @return rien
	   * 
	   */  

	
public void XmlEnseignement(String  Idenseignement,String Matiere ,String  Semestre,String Statutcours) {
		
	Document document = new Document();
	
	DocType dt = new DocType("enseignement", "/home/kawtar/Bureau/XEDIX_2012/xedixts_vb2.10.1.5/bin/enseignement.dtd");
	document.setDocType(dt);
	
	ProcessingInstruction pi = new ProcessingInstruction("XEDIX", "id 1100144");
	ProcessingInstruction pi2 = new ProcessingInstruction("XEDIX", "class DO");
	
	
	document.addContent(pi);
	document.addContent(pi2);
	
	Element racine = new Element("enseignement");
	
	document.setRootElement(racine);
		
		  Element idenseignement = new Element("idEnseignement");
		  idenseignement.setText(Idenseignement);
	      racine.addContent(idenseignement);
				
		  Element matiere = new Element("matiere");
		  matiere.setText(Matiere);
	      racine.addContent(matiere);
	      
	      Element semestre = new Element("semestre");
	      semestre.setText(Semestre);
	      racine.addContent(semestre);
	      
	      Element statutcours = new Element("statutCours");
	      statutcours.setText(Statutcours);
	      racine.addContent(statutcours);
	      
	      
	      affiche(document);
	      enregistre("/home/kawtar/workspace/KB_test/src/bdd/enseignement.xml",document);
			
	}
	
	

/**
   * Methode qui de creer un fichier xml pour un groupe
   * 
   * @param les informations du groupe
   * @return rien
   * 
   */  
	
	
public void XmlGroupe(String  IdGroupe,String nomgroupe ,String  nbpersonne) {
	
	Element racine = new Element("Groupe");
	Document document = new Document(racine);

	  Element Idgroupe = new Element("IdGroupe");
	  Idgroupe.setText(IdGroupe);
      racine.addContent(Idgroupe);
			
	  Element groupe = new Element("nomgroupe");
	  groupe.setText(nomgroupe);
      racine.addContent(groupe);
      
      Element npersonne = new Element("nbpersonne");
      npersonne.setText(nbpersonne);
      racine.addContent(npersonne);
       
      
      affiche(document);
      enregistre("/bdd/groupe.xml",document);
		
}	
	
/**
 * Methode qui de creer un fichier xml pour un departement
 * 
 * @param les informations du departement
 * @return rien
 * 
 */  
	
	
	
public void Xmldepartement(String  idDepartement,String nom ,String  idResponsableDepartement) {
	
	Element racine = new Element("departement");
	Document document = new Document(racine);

	  Element iddepartement = new Element("idDepartement");
	  iddepartement.setText(idDepartement);
      racine.addContent(iddepartement);
			
	  Element nomdep = new Element("nom");
	  nomdep.setText(nom);
      racine.addContent(nom);
      
      Element idresdep = new Element("idResponsableDepartement");
      idresdep.setText(idResponsableDepartement);
      racine.addContent(idresdep);
       
      
      affiche(document);
      enregistre("/bdd/departement.xml",document);
		
}		
	
/**
 * Methode qui de creer un fichier xml pour un filiere
 * 
 * @param les informations du filiere
 * @return rien
 * 
 */  
	
	
	
public void Xmlfiliere(String  idFiliere,String nom ,String  idDepartement) {
	
	Element racine = new Element("filiere");
	Document document = new Document(racine);

	  Element idfiliere = new Element("idFiliere");
	  idfiliere.setText(idFiliere);
      racine.addContent(idfiliere);
			
	  Element nomfiliere = new Element("nom");
	  nomfiliere.setText(nom);
      racine.addContent(nomfiliere);
      
      Element iddepartement = new Element("idDepartement");
      iddepartement.setText(idDepartement);
      racine.addContent(iddepartement);
       
      
      affiche(document);
      enregistre("/bdd/filiere.xml",document);
		
}	
/**
 * Methode qui de creer un fichier xml pour un voeux
 * 
 * @param les informations du voeux
 * @return rien
 * 
 */  

	
public void Xmlvoeux(String  id_voeux,String id_enseignement ,String  id_enseignant, String typeCours, String nombreHeures, String anneeScolaire,String flagEnseigne) {
	
	Element racine = new Element("voeux");
	Document document = new Document(racine);

	  Element idvoeux = new Element("id_voeux");
	  idvoeux.setText(id_voeux);
      racine.addContent(idvoeux);
			
	  Element idenseignement = new Element("id_enseignement");
	  idenseignement.setText(id_enseignement);
      racine.addContent(idenseignement);
      
      Element typecours = new Element("typeCours");
      typecours.setText(typeCours);
      racine.addContent(typecours);
       
      Element nombreheures = new Element("nombreHeures");
      nombreheures.setText(nombreHeures);
      racine.addContent(nombreheures);
      
      Element anneeccolaire = new Element("anneeScolaire");
      anneeccolaire.setText(anneeScolaire);
      racine.addContent(anneeccolaire);
      
      Element flagenseigne = new Element("flagEnseigne");
      flagenseigne.setText(flagEnseigne);
      racine.addContent(flagenseigne);
      
    
      
      
      affiche(document);
      enregistre("/bdd/voeux.xml",document);
		
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void affiche(Document document)
	{
	   try
	   {
	      //On utilise ici un affichage classique avec getPrettyFormat()
	      XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
	      sortie.output(document, System.out);
	   }
	   catch (java.io.IOException e){}
	}

	static void enregistre(String fichier,Document document)
	{
	   try
	   {
	      //On utilise ici un affichage classique avec getPrettyFormat()
	      XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
	      //Remarquez qu'il suffit simplement de cr�er une instance de FileOutputStream
	      //avec en argument le nom du fichier pour effectuer la s�rialisation.
	      sortie.output(document, new FileOutputStream(fichier));
	   }
	   catch (java.io.IOException e){}
	}
	
	
}
