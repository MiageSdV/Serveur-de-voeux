package bdd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Object;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.StringTokenizer;


public class Xedix {
	
	String serveur;
	String cle;
	
	public Xedix(String serv)
	{
		this.serveur = serv;
		this.getSession();
	}
	
	public String detag(String mot, String cle){
		
		String tago="<"+mot+">" ;
		String tagf="</"+mot+">" ;
		String[] tokens = cle.split(tago);
		
	    String temp1=tokens[1];
	    String[] tokens2 = temp1.split(tagf);
	   
	    return tokens2[0];
	}
	
	public void getSession() {

	//  Identification de l'utilisateur
	   String login="admin" ;
	   String password="xedix#amodifier" ;   
	   
	   try {
		   URL url = new URL(this.serveur+"/cgi-bin/client?X2Admin+13++login="+login+"&pwd="+password+"&output=xml");
		   System.out.println(this.serveur+"/cgi-bin/client?X2Admin+13++login="+login+"&pwd="+password+"&output=xml");
		   
		   URLConnection connect = url.openConnection();
		   
		   BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
		   String session;
		   while ((session = in.readLine()) != null) 
		       System.out.println(session);
		   
		   in.close();
		   cle = detag("clefsession",session);
		   System.out.println(cle);
	   
		}
		catch (MalformedURLException e) { 
		    System.out.println("URL mal formé");
		} 
		catch (IOException e) {   
			System.out.println("La connexion a echoue");
		    // ...
		}
		
	}

	public  String xedix_send (String fr, String serveur, String  cleSession, String requete_url, String select_url) {
		
		String flux = null;

		try {
		   URL url = new URL(serveur+"/cgi-bin/client?X2Xsearch+7+admin,"+cleSession+"+allrequest="+requete_url+"&elems="+select_url+"&output=xml&targetcoll=listepropre&high=no&display=simple");
		   System.out.println(serveur+"/cgi-bin/client?X2Xsearch+7+admin,"+cleSession+"+allrequest="+requete_url+"&elems="+select_url+"&output=xml&targetcoll=listepropre&high=no&display=simple");
		   
		   URLConnection connect = url.openConnection();
		   BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
		   String result;
		   while ((result = in.readLine()) != null) 
		       System.out.println(result);
		   
		   in.close();
		   result = detag("xedixlisteetendue",result);
		   
		   System.out.println(result);
			   
	// Nettoyage du flux XML


		   flux=detag("xedixlisteetendue",result);

		} 
		catch (MalformedURLException e) { 
		   System.out.println("URL mal formé");
		} 
		catch (IOException e) {   
			 System.out.println("La connexion a echoue");
		    // ...
		}
		
	    return flux;
		
	}
	
	public String my_encode ( String chaine ) {

		String temp=chaine;
		String temp1=temp.replace("%2F","/");

		String temp2=temp1.replace("%28","(");

		String temp3=temp2.replace("%29",")");

		return  temp3 ;
	}

	public String my_encode2 ( String chaine ) {

		String temp1=chaine.replace("&","%26");

		String temp2=temp1.replace("=","%3D");

		String temp3=temp2.replace(" ","%20");

		return temp3 ;
	}	
	
	
}
