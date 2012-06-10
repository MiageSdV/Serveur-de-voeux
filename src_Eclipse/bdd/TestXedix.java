package bdd;
import java.sql.SQLException;
import java.util.StringTokenizer;

import util.Liste;
import util.ResultSetXedix;


public class TestXedix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Integer i = new Integer(10);
//		String s = "test";
//		
//		Liste l = new Liste();
//		
//		l.add(i);
//		l.add(s);
//		
//		while(l.hasNext())
//		{
//			System.out.println(l.get());
//			l.next();
//		}
		
		/*RequeteXedix rx = new RequeteXedix();
		
		rx.selectChamp("id", "utilisateur");
		rx.selectChamp("total", "entreprise", "ET");
		
		System.out.println(rx.getRequete1());
		
		rx.initSecondRequete("all", "0");
		rx.addWhere("id", "200", "utilisateur");
		
		System.out.println(rx.getRequete2());*/		
		
		
		ResultSetXedix rs = new ResultSetXedix("C:\\Users\\Flo\\workspace\\projetmultisource\\src\\bdd\\enseignant.xml");
		//rs.afficher();
		
		try {
			
			int i = rs.getInt("idEnseignant");
			String nom = rs.getString("nom");
			String prenom = rs.getString("prenom");
			String statut = rs.getString("statut");
			
			System.out.println("L'enseignant avec identifiant : " + i + " s'appelle " +
					nom + " " + prenom + " et a pour statut : " + statut);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
