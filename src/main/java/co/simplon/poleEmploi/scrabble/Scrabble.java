package co.simplon.poleEmploi.scrabble;

public class Scrabble {

	public int getValeur(char c) {
		int valeur;
		switch (c) {
		case 'A':
		case 'E':
		case 'I':
		case 'L':
		case 'N':
		case 'O':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
			valeur = 1;
			break;
		case 'B':
		case 'C':
		case 'P':
			valeur = 3;
			break;
		case 'D':
		case 'G':
		case 'M':
			valeur = 2;
			break;
		case 'F':
		case 'H':
		case 'V':
			valeur = 4;
			break;
		case 'J':
		case 'Q':
			valeur = 8;
			break;
		case 'K':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			valeur = 10;
			break;
		default:
			valeur = 0;
			break;
		}
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
		// TODO Auto-generated method stub
		return "";
	}

}
