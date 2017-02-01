package co.simplon.poleEmploi.scrabble;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;

public class ListeLettresParValeurTest {

	static Scrabble scrabble;

	@BeforeClass
	public static void init() {
		scrabble = new Scrabble();
	}

	@Test
	public void la_liste_des_lettres_de_valeur_0_est_null() {
		assertNull(scrabble.getLettresDeValeur(0));
	}

	@Test
	public void la_liste_des_lettres_de_valeur_1_est_UTSRONLIEA() {
		assertThat("UTSRONLIEA", equalTo(scrabble.getLettresDeValeur(1)));
	}

	@Test
	public void la_liste_des_lettres_de_valeur_3_est_PMCB() {
		assertThat("PMCB", equalTo(scrabble.getLettresDeValeur(3)));
	}

	@Test
	public void la_liste_des_lettres_de_valeur_10_est_ZQ() {
		assertThat("ZQ", equalTo(scrabble.getLettresDeValeur(10)));
	}

}
