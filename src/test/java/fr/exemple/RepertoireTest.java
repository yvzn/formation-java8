package fr.exemple;

import org.junit.Before;

import java.util.Arrays;

public class RepertoireTest {

    private Repertoire repertoire;

    @Before
    public void setUp() throws Exception {
        repertoire = new Repertoire();
        repertoire.setUtilisateurs(Arrays.asList(
                new Utilisateur("Clara", "Schumann", Genre.FEMININ), // LocalDate.of(1980, Month.SEPTEMBER, 13)),
                new Utilisateur("Fauré", "Gabriel", Genre.MASCULIN), // LocalDate.of(1980, Month.MAY, 12)),
                new Utilisateur("Ravel", "Maurice", Genre.MASCULIN), // LocalDate.of(1990, Month.MARCH, 7)),
                new Utilisateur("Satie", "Éric", Genre.MASCULIN), // LocalDate.of(2000, Month.MAY, 17)),
                new Utilisateur("Poulenc", "Francis", Genre.MASCULIN) // LocalDate.of(2010, Month.JANUARY, 7)),
        ));
    }
}