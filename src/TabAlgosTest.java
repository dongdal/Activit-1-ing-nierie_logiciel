//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TabAlgosTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/**
     * Test numéro 1 de la méthode plusGrand, de la class TabAlgos.
     */
    @Test
    public void testPlusGrand() {
        System.out.println("plusGrand");
        int[] tab = null;
        try {
            int resultat = TabAlgos.plusGrand(tab);
            fail("l'exception pour un tableau null aurait dû être levée");
        } catch (IllegalArgumentException e) {
            // rien a faire, c'est normal qu'on ai l'exception
        }
    }
    /**
     * Test numéro 2 de la méthode plusGrand, de la class TabAlgos.
     */
    @Test
    public void testPlusGrand2() {
        System.out.println("plusGrand");
        int[] tab = {};
        try {
            int resultat = TabAlgos.plusGrand(tab);
            fail("l'exception pour un tableau vide aurait dû être levée");
        } catch (IllegalArgumentException e) {
            // rien a faire, c'est normal qu'on ai l'exception
        }
    }
    /**
     * Test numéro 3 de la méthode plusGrand, de la class TabAlgos.
     */
    @Test
    public void testPlusGrand3() {
        System.out.println("plusGrand");
        final int cinq = 5;
        final int un = 1;
        final int trois = 3;
        final int neuf = 9;
        final int moinsDeux = -2;
        final int zero = 0;
        int[] tab = {cinq, zero, trois, moinsDeux, neuf, un};
        assertEquals(neuf, TabAlgos.plusGrand(tab));
    }
    /**
     * Test numéro 1 de la méthode moyenne, de la class TabAlgos.
     */
    @Test
    public void testMoyenne() {
        System.out.println("moyenne");
        int[] tab = null;
        try {
            double resultat = TabAlgos.moyenne(tab);
            fail("l'exception pour un tableau null aurait dû être levée");
        } catch (IllegalArgumentException e) {
            // rien a faire, c'est normal qu'on ai l'exception
        }
    }
    /**
     * Test numéro 2 de la méthode moyenne, de la class TabAlgos.
     */
    @Test
    public void testMoyenne2() {
        System.out.println("moyenne");
        int[] tab = {};
        try {
            double resultat = TabAlgos.moyenne(tab);
            fail("l'exception pour un tableau vide aurait dû être levée");
        } catch (IllegalArgumentException e) {
            // rien a faire, c'est normal qu'on ai l'exception
        }
    }
    /**
     * Test numéro 3 de la méthode moyenne, de la class TabAlgos.
     */
    @Test
    public void testMoyenne3() {
        System.out.println("moyenne");
        final int cinq = 5;
        final int un = 1;
        final int trois = 3;
        final int neuf = 9;
        final int six = 6;
        final int moinsDeux = -2;
        final int seize = 16;
        final int zero = 0;
        int[] tab = {cinq, zero, trois, moinsDeux, neuf, un};
        assertEquals(seize / six, TabAlgos.moyenne(tab));
    }
    /**
     * Test numéro 1 de la méthode egaux, de la class TabAlgos.
     */
    @Test
    public void testEgaux() {
        System.out.println("egaux");
        int[] tab = null;
        int[] tab2 = null;
        try {
            boolean resultat = TabAlgos.egaux(tab, tab2);
            fail("l'exception pour un tableau null aurait dû être levée");
        } catch (IllegalArgumentException e) {
            // rien a faire, c'est normal qu'on ai l'exception
        }
    }
    /**
     * Test numéro 2 de la méthode egaux, de la class TabAlgos.
     */
    @Test
    public void testEgaux2() {
        System.out.println("egaux");
        final int cinq = 5;
        final int un = 1;
        final int trois = 3;
        final int neuf = 9;
        final int moinsDeux = -2;
        final int zero = 0;
        int[] tab = {cinq, zero, trois, moinsDeux, neuf, un};
        int[] tab2 = {cinq, zero, trois, moinsDeux, neuf, un};
        assertEquals(true, TabAlgos.egaux(tab, tab2));
    }
    /**
     * Test numéro 3 de la méthode egaux, de la class TabAlgos.
     */
    @Test
    public void testEgaux3() {
        System.out.println("egaux");
        final int cinq = 5;
        final int un = 1;
        final int trois = 3;
        final int neuf = 9;
        final int moinsDeux = -2;
        final int zero = 0;
        int[] tab = {cinq, zero, trois, moinsDeux, neuf, un};
        int[] tab2 = {un, trois, zero, moinsDeux, neuf, cinq};
        assertEquals(false, TabAlgos.egaux(tab, tab2));
    }
    /**
     * Test numéro 4 de la méthode egaux, de la class TabAlgos.
     */
    @Test
    public void testEgaux4() {
        System.out.println("egaux");
        final int cinq = 5;
        final int un = 1;
        final int trois = 3;
        final int neuf = 9;
        final int moinsDeux = -2;
        final int zero = 0;
        final int quatre = 4;
        int[] tab = {cinq, zero, trois, moinsDeux, neuf, un};
        int[] tab2 = {cinq, zero, trois, moinsDeux, neuf, quatre};
        assertEquals(false, TabAlgos.egaux(tab, tab2));
    }
    /**
     * Test numéro 5 de la méthode egaux, de la class TabAlgos.
     */
    @Test
    public void testEgaux5() {
        System.out.println("egaux");
        final int cinq = 5;
        final int un = 1;
        final int trois = 3;
        final int neuf = 9;
        final int moinsDeux = -2;
        final int zero = 0;
        int[] tab = {cinq, zero, trois, moinsDeux, neuf, un};
        int[] tab2 = {cinq, zero, trois, moinsDeux, neuf};
        assertEquals(false, TabAlgos.egaux(tab, tab2));
    }
    /**
     * Test numéro 1 de la méthode similaires, de la class TabAlgos.
     */
    @Test
    public void testSimilaires() {
        System.out.println("similaires");
        int[] tab = null;
        int[] tab2 = null;
        try {
            boolean resultat = TabAlgos.similaires(tab, tab2);
            fail("l'exception pour un tableau null aurait dû être levée");
        } catch (IllegalArgumentException e) {
            // rien a faire, c'est normal qu'on ai l'exception
        }
    }
    /**
     * Test numéro 2 de la méthode similaires, de la class TabAlgos.
     */
    @Test
    public void testSimilaires2() {
        System.out.println("similaires");
        final int cinq = 5;
        final int un = 1;
        final int trois = 3;
        final int neuf = 9;
        final int moinsDeux = -2;
        final int zero = 0;
        int[] tab = {cinq, zero, trois, moinsDeux, neuf, un};
        int[] tab2 = {cinq, zero, trois, moinsDeux, neuf, un};
        assertEquals(true, TabAlgos.similaires(tab, tab2));
    }
    /**
     * Test numéro 3 de la méthode similaires, de la class TabAlgos.
     */
    @Test
    public void testSimilaires3() {
        System.out.println("similaires");
        final int cinq = 5;
        final int un = 1;
        final int trois = 3;
        final int neuf = 9;
        final int moinsDeux = -2;
        final int zero = 0;
        int[] tab = {cinq, zero, trois, moinsDeux, neuf, un};
        int[] tab2 = {zero, cinq, trois, un, moinsDeux, neuf};
        assertEquals(true, TabAlgos.similaires(tab, tab2));
    }
    /**
     * Test numéro 4 de la méthode similaires, de la class TabAlgos.
     */
    @Test
    public void testSimilaires4() {
        System.out.println("similaires");
        final int cinq = 5;
        final int un = 1;
        final int trois = 3;
        final int neuf = 9;
        final int moinsDeux = -2;
        final int zero = 0;
        int[] tab = {cinq, zero, trois, moinsDeux, neuf, un};
        int[] tab2 = {zero, cinq, trois, un, moinsDeux};
        assertEquals(false, TabAlgos.similaires(tab, tab2));
    }

}
