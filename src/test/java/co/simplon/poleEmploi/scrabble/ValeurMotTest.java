package co.simplon.poleEmploi.scrabble;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;

public class ValeurMotTest {

	static Scrabble scrabble;
	
	@BeforeClass
	public static void init() {
		scrabble = new Scrabble();
	}
	
	@Test
	public void la_valeur_pour_TEST_doit_etre_4() {
		assertThat(4, equalTo(scrabble.getValeur("TEST")));
	}
	
	@Test
	public void la_valeur_pour_SCRABBLE_doit_etre_14() {
		assertThat(14, equalTo(scrabble.getValeur("SCRABBLE")));
	}
	
	@Test
	public void la_valeur_pour_BRAVO_doit_etre_10() {
		assertThat(10, equalTo(scrabble.getValeur("BRAVO")));
	}

}
