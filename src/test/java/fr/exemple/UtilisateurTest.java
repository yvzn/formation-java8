package fr.exemple;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilisateurTest {
    private List<Utilisateur> utilisateurs;

    @Before
    public void setUp() {
        utilisateurs = Arrays.asList(
                new Utilisateur("Clara", "Schumann", Genre.FEMININ), // LocalDate.of(1980, Month.SEPTEMBER, 13)),
                new Utilisateur("Fauré", "Gabriel", Genre.MASCULIN), // LocalDate.of(1980, Month.MAY, 12)),
                new Utilisateur("Ravel", "Maurice", Genre.MASCULIN), // LocalDate.of(1990, Month.MARCH, 7)),
                new Utilisateur("Satie", "Éric", Genre.MASCULIN), // LocalDate.of(2000, Month.MAY, 17)),
                new Utilisateur("Poulenc", "Francis", Genre.MASCULIN) // LocalDate.of(2010, Month.JANUARY, 7)),
        );
    }

    @Test
    public void listeNonVide() {
        assertThat(utilisateurs.size()).isGreaterThan(0);
    }
}
