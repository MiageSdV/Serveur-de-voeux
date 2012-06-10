package util;

import java.io.*;




/**
 * Objet permettant d'inserer des documents dans xedix
 * 
 * 
 * @author Teddy Trifor
 */
public class Insert {

	   /**
		   * Methode qui permet de lancer une requete d'insertion dans xedix
		   * 
		   * @param chemin du fichier xml en injecter
		   * @return rien
		   * 
		   */  
	    
	
	
public  void Insertion(String chemin)     throws Exception {
    // TODO code application logic here

     
    System.out.println("Appel de commandes UNIX en java" );
     
    /*D�claration des variables*/
    String commandes ="/home/kawtar/Bureau/XEDIX_2012/xedixts_vb2.10.1.5/bin/rempli_base -base LOW "+chemin;
    System.out.println(commandes);
   
      
    try {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(commandes);
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = null;
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
        //Attendre la fin de l'execution
        if (process.waitFor() != 0) {
            System.out.println("Une erreur est survenue ");
        }
    } catch (InterruptedException ex) {
       ex.printStackTrace();
    } catch (IOException ex) {
    	 ex.printStackTrace();
    }
   
  
   
}
 
} 