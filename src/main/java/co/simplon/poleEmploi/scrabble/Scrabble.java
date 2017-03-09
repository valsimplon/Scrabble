package co.simplon.poleEmploi.scrabble;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Scrabble {
	
	public Map <Character, Integer> mesLettres;
	
	public Scrabble() {
		mesLettres = new Hashtable<>();
		mesLettres.put('A', 1);
		mesLettres.put('E', 1);
		mesLettres.put('I', 1);
		mesLettres.put('L', 1);
		mesLettres.put('N', 1);
		mesLettres.put('O', 1);
		mesLettres.put('R', 1);
		mesLettres.put('S', 1);
		mesLettres.put('T', 1);
		mesLettres.put('U', 1);
		mesLettres.put('B', 3);
		mesLettres.put('C', 3);
		mesLettres.put('P', 3);
		mesLettres.put('D', 2);
		mesLettres.put('G', 2);
		mesLettres.put('F', 4);
		mesLettres.put('H', 4);
		mesLettres.put('V', 4);
		mesLettres.put('J', 8);
		mesLettres.put('Q', 8);
		mesLettres.put('K', 10);
		mesLettres.put('W', 10);
		mesLettres.put('X', 10);
		mesLettres.put('Y', 10);
		mesLettres.put('Z', 10);
	}

	public int getValeur(char c) {

		Integer valeur = mesLettres.get(c);
		return valeur;
	}

	public int getValeur(String string) {
		int valeurMot = 0;
		
		for (int i = 0; i < string.length(); i++) {
			valeurMot += getValeur(string.charAt(i));
		}
		return valeurMot;
	}

	public String getLettresDeValeur(int i) {
		
		 String chaine = "";
		 
		for (Entry<Character, Integer> laLettre: mesLettres.entrySet()) {
			if (laLettre.getValue() == i) {
				chaine += laLettre.getKey();
			} else if (i == 0) {
				return null;
			}
		}
		return chaine;
	}

}
