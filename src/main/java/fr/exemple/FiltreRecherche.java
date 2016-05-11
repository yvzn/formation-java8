package fr.exemple;

import java.util.Optional;

@FunctionalInterface
public interface FiltreRecherche {
    boolean estResultatValide(Utilisateur utilisateur);
}
