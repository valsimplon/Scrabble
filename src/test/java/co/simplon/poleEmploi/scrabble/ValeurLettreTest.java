package co.simplon.poleEmploi.scrabble;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;

public class ValeurLettreTest {

	static Scrabble scrabble;
	
	@BeforeClass
	public static void init() {
		scrabble = new Scrabble();
	}
	
	@Test
	public void la_valeur_pour_Q_doit_etre_8() {
		assertThat(8, equalTo(scrabble.getValeur('Q')));
	}
	
	@Test
	public void la_valeur_pour_E_doit_etre_1() {
		assertThat(1, equalTo(scrabble.getValeur('E')));
	}
	
	@Test
	public void la_valeur_pour_Y_doit_etre_10() {
		assertThat(10, equalTo(scrabble.getValeur('Y')));
	}

}
