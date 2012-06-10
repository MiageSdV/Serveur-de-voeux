package bdd;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Object;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import org.xml.sax.SAXException;

import util.ResultSetXedix;

/**
 * Objet permettant de se connecter � la base xedix
 * 
 * 
 * @author Teddy Trifor
 */



public class Connexion {
   public String serveur="http://localhost:5290";
   public String cle;
   static org.jdom2.Document document;
    
    /**
	   * Methode pour recupere une balise precise d'une chaine de caractere xml
	   * @param mot la balise de s�paration du fichier xml, cle la chaine de caractere xml
	   * @return la chaine de caractere de la balise mot
	   * 
	   */
   
    public String detag(String mot, String cle){

       
        String tago="<"+mot+">" ;
        String tagf="</"+mot+">" ;
        String[] tokens = cle.split(tago);
       
       
           String temp1=tokens[1];
           String[] tokens2 = temp1.split(tagf);
          
           return tokens2[0];
    }
   
    /**
	   * Methode qui permet de se connecter a la base xedix et recuperer la cle de session
	   * pour les requetes suivantes
	   * @param serveur adressse du serveur en chaine de carac
	   * @return la reponse du serveur a la demande de connexion
	   * 
	   */
 
   
    public String getSession(String serveur) {

//  Identification de l'utilisateur
   String login="admin" ;
   String password="admin";  
  
   try {
   URL url = new URL(serveur+"/cgi-bin/client?X2Admin+13++login="+login+"&pwd="+password+"&output=xml");
   System.out.println(serveur+"/cgi-bin/client?X2Admin+13++login="+login+"&pwd="+password+"&output=xml");
  
   URLConnection connect = url.openConnection();
  
   BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
   String session;
   while ((session = in.readLine()) != null)
       cle=session;
  
   in.close();

 
   cle = detag("clefsession",cle);
   //System.out.println(cle);
    }
    catch (MalformedURLException e) {
       System.out.println("URL mal form�");
    }
    catch (IOException e) {  
         System.out.println("La connexion a echoue");
        // ...
    }
return cle;
       
    }

    /**
	   * Methode qui permet de lancer une requete a la base xedix
	   * 
	   * @param serveur adresse du serveur, clessession la cle de session , requete_url la requete http ,select_url la selection
	   * dans a requete
	   * @return la reponse du serveur a la demande de connexion
     * @throws JDOMException 
	   * 
	   */  
    
    public  String xedix_send (String fr, String serveur, String  cleSession, String requete_url, String select_url) throws ParserConfigurationException, SAXException, JDOMException {
        String flux = null;

        try {
               URL url = new URL(serveur+"/cgi-bin/client?X2Xsearch+7+admin,"+cleSession+"+allrequest="+requete_url+"&elems="+select_url+"&output=xml&targetcoll=listepropre&high=no&display=simple");
            String url2 = serveur+"/cgi-bin/client?X2Xsearch+7+admin,"+cleSession+"+allrequest="+requete_url+"&elems="+select_url+"&output=xml&targetcoll=listepropre&high=no&display=simple";
               System.out.println(serveur+"/cgi-bin/client?X2Xsearch+7+admin,"+cleSession+"+allrequest="+requete_url+"&elems="+select_url+"&output=xml&targetcoll=listepropre&high=no&display=simple");

               ResultSetXedix result = new ResultSetXedix(url2);
               result.afficher();
               
               
               
//       SAXBuilder sxb =new SAXBuilder();
//        document =  sxb.build(url)   ;  
//     Element   racine = document.getRootElement();
//        List liste = racine.getChildren("enseignant");
//        Iterator i= liste.iterator();
//        while(i.hasNext()){
//        	Element courant = (Element)i.next();
//        	System.out.println(courant.getChild("nomE").getText());
//        }
        }
        catch (MalformedURLException e) {
           System.out.println("URL mal form�");
        }
        catch (IOException e) {  
             System.out.println("La connexion a echoue");
            // ...
        }
        return flux;
       
        }
   
       
    /**
	   * Methode qui permet de transformer une chaine de caractere pour etre lisible par xedix
	   * @param chaine de caractere a traiter
	   * @return la chaine de caractere modifier
	   * 
	   */
   
    public String my_encode ( String chaine ) {

        String temp=chaine;
        String temp1=temp.replace("%2F","/");

        String temp2=temp1.replace("%28","(");

        String temp3=temp2.replace("%29",")");

        return  temp3 ;
    }
    
    /**
	   * Methode qui permet de transformer une chaine de caractere pour etre lisible par xedix
	   * @param chaine de caractere a traiter
	   * @return la chaine de caractere modifier
	   * 
	   */

    public String my_encode2 ( String chaine ) {

        String temp1=chaine.replace("&","%26");

        String temp2=temp1.replace("=","%3D");

        String temp3=temp2.replace(" ","%20");

        return temp3 ;
    }   
   
}