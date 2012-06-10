
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import bdd.*;



import util.*;



public class test {

    /**
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
      //  Connexion cn = new Connexion();
        
     //System.out.println(  cn.getSession(cn.serveur));
//
  //cn.xedix_send("fr", cn.serveur, cn.getSession(cn.serveur), "teddy <DANS> enseignant ","");
//   ***
   	InsertXml kxml = new InsertXml();
    	//kxml.XmlProf(idprof, nomprof, prenomprof, loginprof, mdpprof, flagadminprof, rattachementprof, Statutprof, serviceStatutaireprof, serviceEffectueprof)Prof("1","teddy","trifor","titi","toto","math");
    	//kxml.XmlProf("2", "TRIFOR", "Teddy", "titi", "toto", "y", "rattachementprof", "incompetent", "serviceStatutaireprof", "serviceEffectueprof");
  	kxml.XmlEnseignement("10", "Mathematiques", "10", "Attente");
    	
    	Insert ins= new Insert();
   	ins.Insertion("/home/kawtar/workspace/KB_test/src/bdd/enseignement.xml");
    }

}