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
        utilisateurs = RepertoireTest.UTILISATEURS;
    }

    @Test
    public void listeNonVide() {
        assertThat(utilisateurs.size()).isGreaterThan(0);
    }
}
