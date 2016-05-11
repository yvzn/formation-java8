package fr.exemple;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class RepertoireTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(RepertoireTest.class);

    static final java.util.List<Utilisateur> UTILISATEURS = Arrays.asList(
            new Utilisateur("Schumann", "Schumann", Genre.FEMININ), // LocalDate.of(1980, Month.SEPTEMBER, 13)),
            new Utilisateur("Fauré", "Gabriel", Genre.MASCULIN), // LocalDate.of(1980, Month.MAY, 12)),
            new Utilisateur("Ravel", "Maurice", Genre.MASCULIN), // LocalDate.of(1985, Month.MARCH, 7)),
            new Utilisateur("Satie", "Éric", Genre.MASCULIN), // LocalDate.of(1985, Month.MAY, 17)),
            new Utilisateur("Boulanger", "Lily", Genre.MASCULIN), // LocalDate.of(1990, Month.August, 21)),
            new Utilisateur("Poulenc", "Francis", Genre.MASCULIN), // LocalDate.of(1995, Month.JANUARY, 7)),
            new Utilisateur("Schumann", "Robert", Genre.MASCULIN) // LocalDate.of(2000, Month.JUNE, 8)),
    );

    private Repertoire repertoire;

    @Before
    public void setUp() throws Exception {
        repertoire = new Repertoire();
        repertoire.setUtilisateurs(UTILISATEURS);
    }

    @Test
    public void listeNonVide() {
        LOGGER.debug("{} utilisateurs dans la liste", repertoire.getUtilisateurs().size());
        assertThat(repertoire.getUtilisateurs().size()).isGreaterThan(0);
    }
}