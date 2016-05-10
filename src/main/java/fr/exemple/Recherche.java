package fr.exemple;

import java.util.Optional;

@FunctionalInterface
public interface Recherche {
    boolean estResultatValide(Utilisateur utilisateur);
}
