
public class TabAlgos {
	/**
     * @param tab tableau d'entiers
     * @return valeur la plus grande d'un tableau.
     */
    public static int plusGrand(final int[] tab) {
        if (tab == null || tab.length == 0) {
            String str = "Le tableau ne doit pas �tre null ou vide!";
            throw new IllegalArgumentException(str);
        }
        int testeur = tab[0];
        for (int i : tab) {
            if (i > testeur) {
                testeur = i;
            }
        }
        return testeur;
    }
    /**
     * @param tab tableau d'entiers
     * @return moyenne des valeurs du tableau.
     * @throw IllegalArgumentException si tab et null ou vide.
     **/
    public static double moyenne(final int[] tab) {
        // TODO
        if (tab == null || tab.length == 0) {
            String str = "Le tableau ne doit pas �tre null ou vide!";
            throw new IllegalArgumentException(str);
        }
        int som = 0;
        for (int elt : tab) {
            som += elt;
        }
        return som / tab.length;
    }
    /**
     * Compare le contenu de 2 tableaux en tenant compte de l'ordre.
     * @param tab1 premier tableau d'entiers � comparer
     * @param tab2 deuxi�me tableau d'entiers � comparer
     * @return true si les 2 tableaux contiennent les m�mes �l�ments
     * avec les m�mes nombres d'occurences
     * (avec les elements dans le meme ordre).
     **/
    public static boolean egaux(final int[] tab1, final int[] tab2) {
        if (tab1 == null || tab2 == null) {
            String str = "Les tableaux ne doivent pas �tre null !";
            throw new IllegalArgumentException(str);
        }
//        if(tab1.equals(tab2)){
//            return true;
//        }else{
//            return false;
//        }
        if (tab1.length != tab2.length) {
        	return false;
        }
        int k = 0;
        while (k < tab1.length) {
        	if (tab1[k] != tab2[k]) {
        		k++;
        		return false;
            } else {
            	k++;
            }
        }
        return true;
    }
    /**
    * Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
    * @param tab1 premier tableau d'entiers � comparer
    * @param tab2 deuxi�me tableau d'entiers � comparer
    * @return true si les 2 tableaux contiennent les m�mes �l�ments
    * avec les m�mes nombres d'occurrence
    * (pas forc�ment dans le meme ordre).
    **/
    public static boolean similaires(final int[] tab1, final int[] tab2) {
        if (tab1 == null || tab2 == null) {
            String str = "Les tableaux ne doivent pas �tre null !";
            throw new IllegalArgumentException(str);
        }
        trieCroissant(tab1);
        trieCroissant(tab2);
        return egaux(tab1, tab2);
    }
    /**
    * Trie dans l'ordre croissant les �l�ents d'un tableau d'entier
    * pass� en param�tre.
    * @param tab tableau d'entiers � trier
    **/
    public static void trieCroissant(final int[] tab) {
        int i;
        int j;
        int tempo;
        for (i = 1; i < tab.length; i++) {
            tempo = tab[i];
            j = i;
            while ((j >= 1) && (tab[j - 1] > tempo)) {
                tab[j]  = tab[j - 1];
                j = j - 1;
            }
            tab[j] = tempo;
        }
    }
}
